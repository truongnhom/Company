$(document).ready(function(){
    goAnagrafica(); 
});
function goAnagrafica() {
    var anagrafica = $("[id='frmGioco:btnAnagrafica']");
    var anagraficaDelGioco = $("[id='frmGioco:btnAnagraficaDelGioco']");
    var variante = $("[id='frmGioco:btnVariante']");

    clearSelected(anagraficaDelGioco);
    clearSelected(variante);
    activeSelected(anagrafica);
}
function anagraficaDone() {
    var anagrafica = $("[id='frmGioco:btnAnagrafica']");
    var childSpan = anagrafica.find('.ui-icon-blank');
    childSpan.removeClass('ui-icon-blank').addClass('ui-icon-check');
}
function goAnagraficaDelGioco() {
    var anagrafica = $("[id='frmGioco:btnAnagrafica']");
    var anagraficaDelGioco = $("[id='frmGioco:btnAnagraficaDelGioco']");
    var variante = $("[id='frmGioco:btnVariante']");

    activeSelected(anagraficaDelGioco);
    clearSelected(variante);
    clearSelected(anagrafica);
}
function anagraficaDelGiocoDone() {
    var anagraficaDelGioco = $("[id='frmGioco:btnAnagraficaDelGioco']");
    var childSpan = anagraficaDelGioco.find('.ui-icon-blank');
    childSpan.removeClass('ui-icon-blank').addClass('ui-icon-check');
}
function goVariante() {
    var anagrafica = $("[id='frmGioco:btnAnagrafica']");
    var anagraficaDelGioco = $("[id='frmGioco:btnAnagraficaDelGioco']");
    var variante = $("[id='frmGioco:btnVariante']");

    activeSelected(variante);
    clearSelected(anagraficaDelGioco);
    clearSelected(anagrafica);
}
function varianteDone() {
    var variante = $("[id='frmGioco:btnVariante']");
    var childSpan = variante.find('.ui-icon-blank');
    childSpan.removeClass('ui-icon-blank').addClass('ui-icon-check');
}
function clearSelected(node) {
    node.removeClass('btnSelected').addClass('btnCircle');
}
function activeSelected(node) {
    node.removeClass('btnCircle').addClass('btnSelected');
}