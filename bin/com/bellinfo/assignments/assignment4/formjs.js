function onSubmit() {

	parseQuery(document.location.search);
}

function parseQuery(search) {

	var args = search.substring(1).split('&');

	var argsParsed = {};

	var i, arg, kvp, key, value;

	for (i = 0; i < args.length; i++) {

		arg = args[i];

		if (-1 === arg.indexOf('=')) {

			argsParsed[decodeURIComponent(arg).trim()] = true;
		} else {

			kvp = arg.split('=');

			key = decodeURIComponent(kvp[0]).trim();

			value = decodeURIComponent(kvp[1]).trim();

			argsParsed[key] = value;
		}
	}

	var v1 = argsParsed["page"];
	if (v1 == "success") {
		document.getElementById("message").style.visibility = 'visible';
	} else {
		document.getElementById("message").style.visibility = 'hidden';
	}
	return argsParsed;
}
