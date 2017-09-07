<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<html:form action="/inputAction">
		<table>
			<tr>
				<td>Select State :</td>
				<td><html:select property="state">
						<html:option value="0">Select State</html:option>
						<html:optionsCollection name="InputForm" property="stateList"
							label="label" value="value" />
					</html:select></td>
			</tr>
			<tr>
				<td>Select State :</td>
				<td><html:select property="state">
						<html:option value="0">Select State</html:option>

						<html:optionsCollection name="InputForm" property="countryList"
							label="country" value="cod" />
					</html:select></td>
			</tr>
			<tr>
				<td>Select State :</td>
				<td><html:select property="state">
						<html:option value="0">Select State</html:option>
						<html:options collection="lista" property="cod" labelProperty="country"/>
					</html:select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><html:submit property="method"
						value="save" /></td>
			</tr>
		</table>
	</html:form>
</body>
</html>