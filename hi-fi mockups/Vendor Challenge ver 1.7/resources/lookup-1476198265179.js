(function(window, undefined) {
  var dictionary = {
    "26d5dc86-e71f-45f0-b2d6-111cfad230e2": "480px - Rating Expanded",
    "4c2af130-ea7d-48b5-87f0-358b11348cff": "480px -BookingAppointment",
    "9694dae2-0e1d-4b3b-b494-d2fcda19dee5": "768px - TabletBookAppointment",
    "245fedae-9f19-4cda-8b8f-b3ed3db04057": "1366px - WebProviderListMapView",
    "c4b15355-16b2-4aba-adef-786e44551958": "1366px - WebProviderList",
    "3387be20-d3d7-4fbb-9804-571f6e0b2dd8": "1366px - WebAdvancedSearch",
    "ed415560-36d7-41b0-a594-f60c4efbe116": "480px -HomeScreen",
    "729c4470-6019-469b-95dd-99650ff20fc2": "1366px - WebProviderDetails",
    "2809b5a6-ccea-4a76-a036-9185ec4db49d": "768px - Tablet",
    "76cd99a4-9e62-4339-8e06-0dca3e8d2f66": "1366px - WebAppointmentBooked",
    "31e98adb-06bc-4753-8d31-3ed08e7c4a87": "768px - TabletHomeScreen",
    "91a16486-165c-461e-ac7a-984702e12c74": "1366px - WebEmail",
    "511ef4bf-e1b1-4628-89bd-7703be4baa22": "768px - Rating",
    "11d29aa9-9e51-48d2-ae41-b8f7222f8621": "1366px - WebBookingAppointment",
    "3d3c1068-b03c-4fd4-8e1b-36d0c617325b": "768px - TabletAppointmentBooked",
    "13aa6992-e1bf-4da3-bfd2-501de08aa64b": "480px - MobileProviderList",
    "bf03996c-6556-4b7d-bf61-8a7599a1121e": "480px -WebProviderListMapView",
    "5cfff44b-917e-4b29-a1aa-6df938137787": "768px - TabletEmailSent",
    "c27509a6-fa18-4f64-9a74-effcefa0cc2f": "1366px - WebEmailSent",
    "d12245cc-1680-458d-89dd-4f0d7fb22724": "480px - Mobile",
    "63437068-9a5c-445c-93b7-86c140c24234": "768px - TabletProviderDetails",
    "6c866d54-d1ba-4e2e-ad3b-8e020c54851e": "480px -AppointmentBooked",
    "d7c64ab1-43a9-4880-97c1-3cec88986540": "768px - TabletMapView",
    "348d52d0-4d8c-4759-90ba-26b5c8dcd285": "768px - TabletEmail",
    "d502d89d-ae1e-4a48-955d-43cd25112b76": "480px -Email",
    "4cc1e0c8-40ca-457e-8db8-6e01c3f61fee": "480px - Advanced Search",
    "8dc83367-5dbc-409d-a012-ff88cee50a8c": "1366px - Rating Expanded",
    "797157f2-3bbe-496e-925f-08713854288c": "480px - ProviderDetails",
    "9e024fb3-2b52-496d-8897-813505edfcdb": "1366px - Web Basic Search",
    "88757c73-975d-456c-bcbd-0ac4814c9ac1": "768px - TabletAdvancedSearch",
    "9b87fe58-a255-4388-af3b-ef18f9502068": "768px - Rating Expanded",
    "07d94f43-2c14-4038-beaf-d65951250fb8": "480px - Rating",
    "9d572e20-619b-4341-867c-51b4634007b0": "1366px - Rating",
    "8fe98d4d-76ac-4044-a314-91cae16b30a8": "480px -EmailSent",
    "d1c79471-db82-4214-bbd3-011e445bee71": "768px - TabletProviderList",
    "87db3cf7-6bd4-40c3-b29c-45680fb11462": "960 grid - 16 columns",
    "e5f958a4-53ae-426e-8c05-2f7d8e00b762": "960 grid - 12 columns",
    "f39803f7-df02-4169-93eb-7547fb8c961a": "Template 1",
    "bb8abf58-f55e-472d-af05-a7d1bb0cc014": "default"
  };

  var uriRE = /^(\/#)?(screens|templates|masters|scenarios)\/(.*)(\.html)?/;
  window.lookUpURL = function(fragment) {
    var matches = uriRE.exec(fragment || "") || [],
        folder = matches[2] || "",
        canvas = matches[3] || "",
        name, url;
    if(dictionary.hasOwnProperty(canvas)) { /* search by name */
      url = folder + "/" + canvas;
    }
    return url;
  };

  window.lookUpName = function(fragment) {
    var matches = uriRE.exec(fragment || "") || [],
        folder = matches[2] || "",
        canvas = matches[3] || "",
        name, canvasName;
    if(dictionary.hasOwnProperty(canvas)) { /* search by name */
      canvasName = dictionary[canvas];
    }
    return canvasName;
  };
})(window);