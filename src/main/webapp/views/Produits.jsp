<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Produits</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div>
<s:form action="save" method="post">
		<s:textfield label="Reference" name="p.reference"></s:textfield>
		<s:textfield label="Designation" name="p.designation"></s:textfield>
		<s:textfield label="Prix" name="p.prix"></s:textfield>
		<s:textfield label="Quantite" name="p.quantite"></s:textfield>
		<s:checkbox label="Promo" name="p.promo"></s:checkbox>
		<s:hidden name="p.update"></s:hidden>
		<s:submit value="Save"></s:submit>
	
</s:form>
</div>

<div>
	<table class="tab1">
		<tr>
			<th>Reference</th>
			<th>Designation</th>
			<th>PRIX</th>
			<th>Quantite</th>
			<th>Promo</th>
			<th>Actions</th>
			
		</tr>
		<s:iterator value="produits">
			<tr>
				<td><s:property value="reference"/></td>
				<td><s:property value="designation"/></td>
				<td><s:property value="prix"/></td>
				<td><s:property value="quantite"/></td>
				<td><s:property value="promo"/></td>
				
					<s:url namespace="/" action="delete" var="a1">
						<s:param name="ref">
							<s:property value="reference"/>
						</s:param>
					</s:url>
					
					<s:url namespace="/" action="update" var="a2">
						<s:param name="ref">
							<s:property value="reference"/>
						</s:param>
					</s:url>
					<td>
						<s:a href="%{a1}">Supprimer</s:a>
						<s:a href="%{a2}">Editer</s:a>
						
				   </td>
								
				
				
			</tr>
		</s:iterator>
	  
	</table>

</div>
</body>
</html>