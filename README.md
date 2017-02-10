# introsde2017-final-project
# Business Service
**Final project | University of Trento**

Documentation about the Business Service: SOAP Web Service


It was deployed on heroku at this link: https://business--service.herokuapp.com/business?wsdl

## API
#### Create person. Check if a person with a chatId exists. If not, it creates the person.
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.business.introsde/">
        <m:createPerson>
        	<person>
                <birthdate>02/01/1963</birthdate>
                <email>JohnFidge@gmail.com</email>
                <firstname>John</firstname>
                <lastname>Fidge</lastname>
                <chatId>123</chatId>
            </person>
        </m:createPerson>
    </soap:Body>
</soap:Envelope>
```

#### Save person measure, and if for the first time weight and height are both set then sets the informations in the external API with setInfo method.
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.business.introsde/">
        <m:savePersonMeasure>
            <chatId>1</chatId>
            <measure>
                <measureType>height</measureType>
                <measureValue>180</measureValue>
                <measureValueType>integer</measureValueType>
            </measure>
        </m:savePersonMeasure>
    </soap:Body>
</soap:Envelope>
```

#### Read the person with chatId without sensible datas
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.business.introsde/">
        <m:getProfile>
            <chatId>123</chatId>
        </m:getProfile>
    </soap:Body>
</soap:Envelope>
```

#### Update person (no measure)
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://soap.business.introsde/">
        <m:updatePerson>
            <person>
               	<chatId>123</chatId>
                <email>pallino.panco@gmail.com</email>
                <firstname>Pallino</firstname>      
            </person>
        </m:updatePerson>
    </soap:Body>
</soap:Envelope>
```

#### Get the amount of calories that consumes the selected exercise.
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.business.introsde/">
        <m:getCalories>
            <chatId>123</chatId>
            <exercise>
			    <name>Painting</name>
			    <minutes>50</minutes>
            </exercise>
        </m:getCalories>
    </soap:Body>
</soap:Envelope>
```

#### Update the sleeping time.
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.business.introsde/">
        <m:setSleepTime>
        	<chatId>123</chatId>
        	<hours>8.30</hours>
        </m:setSleepTime>
    </soap:Body>
</soap:Envelope>
```

#### Get a random exercise
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.business.introsde/">
        <m:getExercise>
        	<chatId>123</chatId>
        </m:getExercise>
    </soap:Body>
</soap:Envelope>
```

#### Get the daily exercise for the user
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.business.introsde/">
        <m:getTodayExercises>
        	<chatId>123</chatId>
        </m:getTodayExercises>
    </soap:Body>
</soap:Envelope>
```