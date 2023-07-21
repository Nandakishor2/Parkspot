from flask import Flask, render_template
from flask_socketio import SocketIO, emit
from flask import request
import pandas as pd
import csv
import time
import finals
import cv2
fun = []
app = Flask(__name__)
file = open('event.csv')
csvreader = csv.reader(file)
row = []
for rows in csvreader:
    row.append(rows)

@app.route('/')
def index():
    return "homepage"

@app.route("/parkingspace")
def parkdata():
    fun.append("Done")
    return row[300+len(fun)]

def venue2():
    while True:
        width = 107
        hieght = 48
        measure = 1050
        fname = "Carparkingpos"
        a = finals.position(width,hieght,fname,measure)
        cap = cv2.VideoCapture("1.mp4")
        while True:
            if cap.get(cv2.CAP_PROP_POS_FRAMES) == cap.get(cv2.CAP_PROP_FRAME_COUNT):
                cap.set(cv2.CAP_PROP_POS_FRAMES,0)
            Success,img= cap.read()
            res1 = a.checkparkspace(img)
            return res1
@app.route('/phone')
def phonenum():
    df = pd.read_csv("data.csv")
    mobnumbers = df.mobile.to_list()
    return mobnumbers
@app.route('/validate',methods = ['POST'])
def password():
    passcode = request.form["passcode"]
    mobile = request.form["mobile"]
  
    df = pd.read_csv("data.csv")
    password =df[df.mobile==int(mobile)].password.to_list()
    if (password[0] == passcode):
        print("Login Successful")
        return "Login Successful"
    else:
        print("Validation failed")
        return "Validation failed"

    
  
@app.route('/data',methods = ['POST'])
def dataentry():
    df = pd.read_csv("data.csv");
    name = request.form["name"]
    mobile = request.form["mobile"]
    age = request.form["age"]
    gender = request.form["gender"]
    password = request.form["password"]
    mobnumbers = df.mobile.to_list()
    if(len(name)<=0):
        return "Check the name field"
    if(len(mobile )!=10):
        return "check the mobile number field"
    if(len(password )<8):
        return "check the password field"
    if(int(mobile) in mobnumbers):
        return "duplicate mobile number detected"
    
    if(len(mobile) ==10 and len(name)>0 and int(age) >0 and len(password)>8):
        data = {
            "name":name,
            "mobile":mobile,
            "age":age,
            "gender":gender,
            "password":password
        }
        print(type(mobile),type(mobnumbers[1]))
        df = df.append(data,ignore_index=True);
        df.to_csv("data.csv",index=False)
        return "Signup Successful"
    
   
if __name__ == '__main__':

    app.run(debug=True ,port = 8000,host='0.0.0.0')
