<!DOCTYPE html>
<html>
	<head>
	</head>
	<body>
        <g:form controller="test" action="save">
            <label>First Name: </label>
            <g:textField name="firstName"/><br/>
            <label>Last Name: </label>
            <g:textField name="lastName"/><br/>
            <label>Age: </label>
            <g:textField name="age"/><br/>
            <g:actionSubmit value="Save"/>
        </g:form>
	</body>
</html>