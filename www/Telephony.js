function Telephony() {
}
Telephony.prototype = {
  getInfo: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "Telephony", "", []);
  }
};
Telephony.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.plugins.Telephony = new Telephony();
  return window.plugins.Telephony;
};
cordova.addConstructor(Telephony.install);
