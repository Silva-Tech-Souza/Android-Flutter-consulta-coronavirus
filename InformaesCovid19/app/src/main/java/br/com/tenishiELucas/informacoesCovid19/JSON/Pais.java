package br.com.tenishiELucas.informacoesCovid19.JSON;

import android.content.Context;

import androidx.annotation.NonNull;

import org.json.JSONObject;

import br.com.tenishiELucas.informacoesCovid19.R;

public class Pais extends JSONObject {

    private Context context;

    public Pais(Context context){

        this.context = context;

    }

    private String NomePais, dataUltimaAtualizacao;
    private int numConfirmados, mortes, recuperacao;

    public String getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public String getNomePais() {
        return NomePais;
    }

    public void setNomePais(String nomePais) {

        if( nomePais.equals("Andorra") ){

            this.NomePais = context.getString(R.string.Andorra);

        }else if( nomePais.equals("United Arab Emirates") ){

            this.NomePais = context.getString(R.string.United_Arab_Emirates);

        }else if( nomePais.equals("Afghanistan") ){

            this.NomePais = context.getString(R.string.Afghanistan);

        }else if( nomePais.equals("Antigua and Barbuda") ){

            this.NomePais = context.getString(R.string.Antigua_and_Barbuda);

        }else if( nomePais.equals("Anguilla") ){

            this.NomePais = context.getString(R.string.Anguilla);

        }else if( nomePais.equals("Albania") ){

            this.NomePais = context.getString(R.string.Albania);

        }else if( nomePais.equals("Armenia") ){

            this.NomePais = context.getString(R.string.Armenia);

        }else if( nomePais.equals("Angola") ){

            this.NomePais = context.getString(R.string.Angola);

        }else if( nomePais.equals("Antarctica") ){

            this.NomePais = context.getString(R.string.Antarctica);

        }else if( nomePais.equals("Argentina") ){

            this.NomePais = context.getString(R.string.Argentina);

        }else if( nomePais.equals("American Samoa") ){

            this.NomePais = context.getString(R.string.American_Samoa);

        }else if( nomePais.equals("Austria") ){

            this.NomePais = context.getString(R.string.Austria);

        }else if( nomePais.equals("Australia") ){

            this.NomePais = context.getString(R.string.Australia);

        }else if( nomePais.equals("Aruba") ){

            this.NomePais = context.getString(R.string.Aruba);

        }else if( nomePais.equals("Åland Islands") ){

            this.NomePais = context.getString(R.string.Aland_Islands);

        }else if( nomePais.equals("Azerbaijan") ){

            this.NomePais = context.getString(R.string.Azerbaijan);

        }else if( nomePais.equals("Bosnia and Herzegovina") ){

            this.NomePais = context.getString(R.string.Bosnia_and_Herzegovina);

        }else if( nomePais.equals("Barbados") ){

            this.NomePais = context.getString(R.string.Barbados);

        }else if( nomePais.equals("Bangladesh") ){

            this.NomePais = context.getString(R.string.Bangladesh);

        }else if( nomePais.equals("Belgium") ){

            this.NomePais = context.getString(R.string.Belgium);

        }else if( nomePais.equals("Burkina Faso") ){

            this.NomePais = context.getString(R.string.Burkina_Faso);

        }else if( nomePais.equals("Bulgaria") ){

            this.NomePais = context.getString(R.string.Bulgaria);

        }else if( nomePais.equals("Bahrain") ){

            this.NomePais = context.getString(R.string.Bahrain);

        }else if( nomePais.equals("Burundi") ){

            this.NomePais = context.getString(R.string.Burundi);

        }else if( nomePais.equals("Benin") ){

            this.NomePais = context.getString(R.string.Benin);

        }else if( nomePais.equals("Saint Barthélemy") ){

            this.NomePais = context.getString(R.string.Saint_Barthélemy);

        }else if( nomePais.equals("Bermuda") ){

            this.NomePais = context.getString(R.string.Bermuda);

        }else if( nomePais.equals("Brunei") ){

            this.NomePais = context.getString(R.string.Brunei);

        }else if( nomePais.equals("Bolivia") ){

            this.NomePais = context.getString(R.string.Bolivia);

        }else if( nomePais.equals("Bonaire, Sint Eustatius and Saba") ){

            this.NomePais = context.getString(R.string.Bonaire_Sint_Eustatius_and_Saba);

        }else if( nomePais.equals("Brazil") ){

            this.NomePais = context.getString(R.string.Brazil);

        }else if( nomePais.equals("Bahamas") ){

            this.NomePais = context.getString(R.string.Bahamas);

        }else if( nomePais.equals("Bhutan") ){

            this.NomePais = context.getString(R.string.Bhutan);

        }else if( nomePais.equals("Bouvet Island") ){

            this.NomePais = context.getString(R.string.Bouvet_Island);

        }else if( nomePais.equals("Botswana") ){

            this.NomePais = context.getString(R.string.Botswana);

        }else if( nomePais.equals("Belarus") ){

            this.NomePais = context.getString(R.string.Belarus);

        }else if( nomePais.equals("Belize") ){

            this.NomePais = context.getString(R.string.Belize);

        }else if( nomePais.equals("Canada") ){

            this.NomePais = context.getString(R.string.Canada);

        }else if( nomePais.equals("Cocos (Keeling) Islands") ){

            this.NomePais = context.getString(R.string.Cocos_Islands);

        }else if( nomePais.equals("Congo (Kinshasa)") ){

            this.NomePais = context.getString(R.string.Congo_Kinshasa);

        }else if( nomePais.equals("Central African Republic") ){

            this.NomePais = context.getString(R.string.Central_African_Republic);

        }else if( nomePais.equals("Congo") ){

            this.NomePais = context.getString(R.string.Congo);

        }else if( nomePais.equals("Switzerland") ){

            this.NomePais = context.getString(R.string.Swaziland);

        }else if( nomePais.equals("Cote d'Ivoire") ){

            this.NomePais = context.getString(R.string.Cote_d_Ivoire);

        }else if( nomePais.equals("Cook Islands") ){

            this.NomePais = context.getString(R.string.Cook_Islands);

        }else if( nomePais.equals("Chile") ){

            this.NomePais = context.getString(R.string.Chile);

        }else if( nomePais.equals("Cameroon") ){

            this.NomePais = context.getString(R.string.Cameroon);

        }else if( nomePais.equals("China") ){

            this.NomePais = context.getString(R.string.China);

        }else if( nomePais.equals("Colombia") ){

            this.NomePais = context.getString(R.string.Colombia);

        }else if( nomePais.equals("Costa Rica") ){

            this.NomePais = context.getString(R.string.Costa_Rica);

        }else if( nomePais.equals("Cuba") ){

            this.NomePais = context.getString(R.string.Cuba);

        }else if( nomePais.equals("Cape Verde") ){

            this.NomePais = context.getString(R.string.Cape_Verde);

        }else if( nomePais.equals("Curaçao") ){

            this.NomePais = context.getString(R.string.Curaçao);

        }else if( nomePais.equals("Christmas Island") ){

            this.NomePais = context.getString(R.string.Christmas_Island);

        }else if( nomePais.equals("Cyprus") ){

            this.NomePais = context.getString(R.string.Cyprus);

        }else if( nomePais.equals("Czechia") ){

            this.NomePais = context.getString(R.string.Czechia);

        }else if( nomePais.equals("Germany") ){

            this.NomePais = context.getString(R.string.Germany);

        }else if( nomePais.equals("Djibouti") ){

            this.NomePais = context.getString(R.string.Djibouti);

        }else if( nomePais.equals("Denmark") ){

            this.NomePais = context.getString(R.string.Denmark);

        }else if( nomePais.equals("Dominica") ){

            this.NomePais = context.getString(R.string.Dominica);

        }else if( nomePais.equals("Dominican Republic") ){

            this.NomePais = context.getString(R.string.Dominican_Republic);

        }else if( nomePais.equals("Cruise Ship") ){

            this.NomePais = context.getString(R.string.Cruise_Ship);

        }else if( nomePais.equals("Algeria") ){

            this.NomePais = context.getString(R.string.Algeria);

        }else if( nomePais.equals("Ecuador") ){

            this.NomePais = context.getString(R.string.Ecuador);

        }else if( nomePais.equals("Estonia") ){

            this.NomePais = context.getString(R.string.Estonia);

        }else if( nomePais.equals("Egypt") ){

            this.NomePais = context.getString(R.string.Egypt);

        }else if( nomePais.equals("Western Sahara") ){

            this.NomePais = context.getString(R.string.Western_Sahara);

        }else if( nomePais.equals("Eritrea") ){

            this.NomePais = context.getString(R.string.Eritrea);

        }else if( nomePais.equals("Spain") ){

            this.NomePais = context.getString(R.string.Spain);

        }else if( nomePais.equals("Ethiopia") ){

            this.NomePais = context.getString(R.string.Ethiopia);

        }else if( nomePais.equals("European Union") ){

            this.NomePais = context.getString(R.string.European_Union);

        }else if( nomePais.equals("Finland") ){

            this.NomePais = context.getString(R.string.Finland);

        }else if( nomePais.equals("Fiji") ){

            this.NomePais = context.getString(R.string.Fiji);

        }else if( nomePais.equals("Falkland Islands (Malvinas)") ){

            this.NomePais = context.getString(R.string.Falkland_Islands_Malvinas);

        }else if( nomePais.equals("Micronesia") ){

            this.NomePais = context.getString(R.string.Micronesia);

        }else if( nomePais.equals("Faroe Islands") ){

            this.NomePais = context.getString(R.string.Faroe_Islands);

        }else if( nomePais.equals("France") ){

            this.NomePais = context.getString(R.string.France);

        }else if( nomePais.equals("Gabon") ){

            this.NomePais = context.getString(R.string.Gabon);

        }else if( nomePais.equals("United Kingdom") ){

            this.NomePais = context.getString(R.string.United_Kingdom);

        }else if( nomePais.equals("Grenada") ){

            this.NomePais = context.getString(R.string.Grenada);

        }else if( nomePais.equals("Georgia") ){

            this.NomePais = context.getString(R.string.Georgia);

        }else if( nomePais.equals("French Guiana") ){

            this.NomePais = context.getString(R.string.French_Guiana);

        }else if( nomePais.equals("Guernsey") ){

            this.NomePais = context.getString(R.string.Guernsey);

        }else if( nomePais.equals("Ghana") ){

            this.NomePais = context.getString(R.string.Ghana);

        }else if( nomePais.equals("Gibraltar") ){

            this.NomePais = context.getString(R.string.Gibraltar);

        }else if( nomePais.equals("Greenland") ){

            this.NomePais = context.getString(R.string.Greenland);

        }else if( nomePais.equals("Gambia") ){

            this.NomePais = context.getString(R.string.Gambia);

        }else if( nomePais.equals("Guinea") ){

            this.NomePais = context.getString(R.string.Guinea);

        }else if( nomePais.equals("Guadeloupe") ){

            this.NomePais = context.getString(R.string.Guadeloupe);

        }else if( nomePais.equals("Equatorial Guinea") ){

            this.NomePais = context.getString(R.string.Equatorial_Guinea);

        }else if( nomePais.equals("Greece") ){

            this.NomePais = context.getString(R.string.Greece);

        }else if( nomePais.equals("South Georgia") ){

            this.NomePais = context.getString(R.string.South_Georgia);

        }else if( nomePais.equals("Guatemala") ){

            this.NomePais = context.getString(R.string.Guatemala);

        }else if( nomePais.equals("Guam") ){

            this.NomePais = context.getString(R.string.Guam);

        }else if( nomePais.equals("Guinea-Bissau") ){

            this.NomePais = context.getString(R.string.Guinea_Bissau);

        }else if( nomePais.equals("Guyana") ){

            this.NomePais = context.getString(R.string.Guyana);

        }else if( nomePais.equals("Hong Kong") ){

            this.NomePais = context.getString(R.string.Hong_Kong);

        }else if( nomePais.equals("Heard Island and Mcdonald Islands") ){

            this.NomePais = context.getString(R.string.Heard_Island_and_Mcdonald_Islands);

        }else if( nomePais.equals("Honduras") ){

            this.NomePais = context.getString(R.string.Honduras);

        }else if( nomePais.equals("Croatia") ){

            this.NomePais = context.getString(R.string.Croatia);

        }else if( nomePais.equals("Haiti") ){

            this.NomePais = context.getString(R.string.Haiti);

        }else if( nomePais.equals("Hungary") ){

            this.NomePais = context.getString(R.string.Hungary);

        }else if( nomePais.equals("Indonesia") ){

            this.NomePais = context.getString(R.string.Indonesia);

        }else if( nomePais.equals("Ireland") ){

            this.NomePais = context.getString(R.string.Ireland);

        }else if( nomePais.equals("Israel") ){

            this.NomePais = context.getString(R.string.Israel);

        }else if( nomePais.equals("Isle of Man") ){

            this.NomePais = context.getString(R.string.Isle_of_Man);

        }else if( nomePais.equals("India") ){

            this.NomePais = context.getString(R.string.India);

        }else if( nomePais.equals("British Indian Ocean Territory") ){

            this.NomePais = context.getString(R.string.British_Indian_Ocean_Territory);

        }else if( nomePais.equals("Iraq") ){

            this.NomePais = context.getString(R.string.Iraq);

        }else if( nomePais.equals("Iran") ){

            this.NomePais = context.getString(R.string.Iran);

        }else if( nomePais.equals("Iceland") ){

            this.NomePais = context.getString(R.string.Iceland);

        }else if( nomePais.equals("Italy") ){

            this.NomePais = context.getString(R.string.Italy);

        }else if( nomePais.equals("Jersey") ){

            this.NomePais = context.getString(R.string.Jersey);

        }else if( nomePais.equals("Jamaica") ){

            this.NomePais = context.getString(R.string.Jamaica);

        }else if( nomePais.equals("Jordan") ){

            this.NomePais = context.getString(R.string.Jordan);

        }else if( nomePais.equals("Japan") ){

            this.NomePais = context.getString(R.string.Japan);

        }else if( nomePais.equals("Kenya") ){

            this.NomePais = context.getString(R.string.Kenya);

        }else if( nomePais.equals("Kyrgyzstan") ){

            this.NomePais = context.getString(R.string.Kyrgyzstan);

        }else if( nomePais.equals("Cambodia") ){

            this.NomePais = context.getString(R.string.Cambodia);

        }else if( nomePais.equals("Kiribati") ){

            this.NomePais = context.getString(R.string.Kiribati);

        }else if( nomePais.equals("Comoros") ){

            this.NomePais = context.getString(R.string.Comoros);

        }else if( nomePais.equals("Saint Kitts and Nevis") ){

            this.NomePais = context.getString(R.string.Saint_Kitts_and_Nevis);

        }else if( nomePais.equals("North Korea") ){

            this.NomePais = context.getString(R.string.North_Korea);

        }else if( nomePais.equals("Korea, South") ){

            this.NomePais = context.getString(R.string.Korea_South);

        }else if( nomePais.equals("Kuwait") ){

            this.NomePais = context.getString(R.string.Kuwait);

        }else if( nomePais.equals("Cayman Islands") ){

            this.NomePais = context.getString(R.string.Cayman_Islands);

        }else if( nomePais.equals("Kazakhstan") ){

            this.NomePais = context.getString(R.string.Kazakhstan);

        }else if( nomePais.equals("Lao People's Democratic Republic") ){

            this.NomePais = context.getString(R.string.Lao_People_s_Democratic_Republic);

        }else if( nomePais.equals("Lebanon") ){

            this.NomePais = context.getString(R.string.Lebanon);

        }else if( nomePais.equals("Saint Lucia") ){

            this.NomePais = context.getString(R.string.Saint_Lucia);

        }else if( nomePais.equals("Liechtenstein") ){

            this.NomePais = context.getString(R.string.Liechtenstein);

        }else if( nomePais.equals("Sri Lanka") ){

            this.NomePais = context.getString(R.string.Sri_Lanka);

        }else if( nomePais.equals("Liberia") ){

            this.NomePais = context.getString(R.string.Liberia);

        }else if( nomePais.equals("Lesotho") ){

            this.NomePais = context.getString(R.string.Lesotho);

        }else if( nomePais.equals("Lithuania") ){

            this.NomePais = context.getString(R.string.Lithuania);

        }else if( nomePais.equals("Luxembourg") ){

            this.NomePais = context.getString(R.string.Luxembourg);

        }else if( nomePais.equals("Latvia") ){

            this.NomePais = context.getString(R.string.Latvia);

        }else if( nomePais.equals("Libya") ){

            this.NomePais = context.getString(R.string.Libya);

        }else if( nomePais.equals("Morocco") ){

            this.NomePais = context.getString(R.string.Morocco);

        }else if( nomePais.equals("Monaco") ){

            this.NomePais = context.getString(R.string.Monaco);

        }else if( nomePais.equals("Moldova") ){

            this.NomePais = context.getString(R.string.Moldova);

        }else if( nomePais.equals("Montenegro")){

            this.NomePais = context.getString(R.string.Montenegro);

        }else if( nomePais.equals("Saint Martin (French Part)") ){

            this.NomePais = context.getString(R.string.Saint_Martin_French_Part);

        }else if( nomePais.equals("Madagascar") ){

            this.NomePais = context.getString(R.string.Madagascar);

        }else if( nomePais.equals("Marshall Islands") ){

            this.NomePais = context.getString(R.string.Marshall_Islands);

        }else if( nomePais.equals("North Macedonia") ){

            this.NomePais = context.getString(R.string.North_Macedonia);

        }else if( nomePais.equals("Mali") ){

            this.NomePais = context.getString(R.string.Mali);

        }else if( nomePais.equals("Myanmar") ){

            this.NomePais = context.getString(R.string.Myanmar);

        }else if( nomePais.equals("Mongolia") ){

            this.NomePais = context.getString(R.string.Mongolia);

        }else if( nomePais.equals("Macao") ){

            this.NomePais = context.getString(R.string.Macao);

        }else if( nomePais.equals("Northern Mariana Islands") ){

            this.NomePais = context.getString(R.string.Northern_Mariana_Islands);

        }else if( nomePais.equals("Martinique") ){

            this.NomePais = context.getString(R.string.Martinique);

        }else if( nomePais.equals("Mauritania") ){

            this.NomePais = context.getString(R.string.Mauritania);

        }else if( nomePais.equals("Montserrat") ){

            this.NomePais = context.getString(R.string.Montserrat);

        }else if( nomePais.equals("Malta") ){

            this.NomePais = context.getString(R.string.Malta);

        }else if( nomePais.equals("Mauritius") ){

            this.NomePais = context.getString(R.string.Mauritius);

        }else if( nomePais.equals("Maldives") ){

            this.NomePais = context.getString(R.string.Maldives);

        }else if( nomePais.equals("Malawi") ){

            this.NomePais = context.getString(R.string.Malawi);

        }else if( nomePais.equals("Mexico") ){

            this.NomePais = context.getString(R.string.Mexico);

        }else if( nomePais.equals("Malaysia") ){

            this.NomePais = context.getString(R.string.Malaysia);

        }else if( nomePais.equals("Mozambique") ){

            this.NomePais = context.getString(R.string.Mozambique);

        }else if( nomePais.equals("Namibia") ){

            this.NomePais = context.getString(R.string.Namibia);

        }else if( nomePais.equals("New Caledonia") ){

            this.NomePais = context.getString(R.string.New_Caledonia);

        }else if( nomePais.equals("Niger") ){

            this.NomePais = context.getString(R.string.Niger);

        }else if( nomePais.equals("Norfolk Island") ){

            this.NomePais = context.getString(R.string.Norfolk_Island);

        }else if( nomePais.equals("Nigeria") ){

            this.NomePais = context.getString(R.string.Nigeria);

        }else if( nomePais.equals("Nicaragua") ){

            this.NomePais = context.getString(R.string.Nicaragua);

        }else if( nomePais.equals("Netherlands") ){

            this.NomePais = context.getString(R.string.Netherlands);

        }else if( nomePais.equals("Norway") ){

            this.NomePais = context.getString(R.string.Norway);

        }else if( nomePais.equals("Nepal") ){

            this.NomePais = context.getString(R.string.Nepal);

        }else if( nomePais.equals("Nauru") ){

            this.NomePais = context.getString(R.string.Nauru);

        }else if( nomePais.equals("Niue") ){

            this.NomePais = context.getString(R.string.Niue);

        }else if( nomePais.equals("New Zealand") ){

            this.NomePais = context.getString(R.string.New_Zealand);

        }else if( nomePais.equals("Oman") ){

            this.NomePais = context.getString(R.string.Oman);

        }else if( nomePais.equals("Panama") ){

            this.NomePais = context.getString(R.string.Panama);

        }else if( nomePais.equals("Peru") ){

            this.NomePais = context.getString(R.string.Peru);

        }else if( nomePais.equals("French Polynesia") ){

            this.NomePais = context.getString(R.string.French_Polynesia);

        }else if( nomePais.equals("Papua New Guinea") ){

            this.NomePais = context.getString(R.string.Papua_New_Guinea);

        }else if( nomePais.equals("Philippines") ){

            this.NomePais = context.getString(R.string.Philippines);

        }else if( nomePais.equals("Pakistan") ){

            this.NomePais = context.getString(R.string.Pakistan);

        }else if( nomePais.equals("Poland") ){

            this.NomePais = context.getString(R.string.Poland);

        }else if( nomePais.equals("Saint Pierre and Miquelon") ){

            this.NomePais = context.getString(R.string.Saint_Pierre_and_Miquelon);

        }else if( nomePais.equals("Pitcairn") ){

            this.NomePais = context.getString(R.string.Pitcairn);

        }else if( nomePais.equals("Puerto Rico") ){

            this.NomePais = context.getString(R.string.Puerto_Rico);

        }else if( nomePais.equals("Palestinian Territory") ){

            this.NomePais = context.getString(R.string.Palestinian_Territory);

        }else if( nomePais.equals("Portugal") ){

            this.NomePais = context.getString(R.string.Portugal);

        }else if( nomePais.equals("Palau") ){

            this.NomePais = context.getString(R.string.Palau);

        }else if( nomePais.equals("Paraguay") ){

            this.NomePais = context.getString(R.string.Paraguay);

        }else if( nomePais.equals("Qatar") ){

            this.NomePais = context.getString(R.string.Qatar);

        }else if( nomePais.equals("Réunion") ){

            this.NomePais = context.getString(R.string.Réunion);

        }else if( nomePais.equals("Romania") ){

            this.NomePais = context.getString(R.string.Romania);

        }else if( nomePais.equals("Serbia") ){

            this.NomePais = context.getString(R.string.Serbia);

        }else if( nomePais.equals("Russia") ){

            this.NomePais = context.getString(R.string.Russia);

        }else if( nomePais.equals("Rwanda") ){

            this.NomePais = context.getString(R.string.Rwanda);

        }else if( nomePais.equals("Saudi Arabia") ){

            this.NomePais = context.getString(R.string.Saudi_Arabia);

        }else if( nomePais.equals("Solomon Islands") ){

            this.NomePais = context.getString(R.string.Solomon_Islands);

        }else if( nomePais.equals("Seychelles") ){

            this.NomePais = context.getString(R.string.Seychelles);

        }else if( nomePais.equals("Sudan") ){

            this.NomePais = context.getString(R.string.Sudan);

        }else if( nomePais.equals("Sweden") ){

            this.NomePais = context.getString(R.string.Sweden);

        }else if( nomePais.equals("Singapore") ){

            this.NomePais = context.getString(R.string.Singapore);

        }else if( nomePais.equals("Saint Helena, Ascension and Tristan Da Cunha") ){

            this.NomePais = context.getString(R.string.Saint_Helena_Ascension_and_Tristan_Da_Cunha);

        }else if( nomePais.equals("Slovenia") ){

            this.NomePais = context.getString(R.string.Slovenia);

        }else if( nomePais.equals("Svalbard and Jan Mayen") ){

            this.NomePais = context.getString(R.string.Svalbard_and_Jan_Mayen);

        }else if( nomePais.equals("Slovakia") ){

            this.NomePais = context.getString(R.string.Slovakia);

        }else if( nomePais.equals("Sierra Leone") ){

            this.NomePais = context.getString(R.string.Sierra_Leone);

        }else if( nomePais.equals("San Marino") ){

            this.NomePais = context.getString(R.string.San_Marino);

        }else if( nomePais.equals("Senegal") ){

            this.NomePais = context.getString(R.string.Senegal);

        }else if( nomePais.equals("Somalia") ){

            this.NomePais = context.getString(R.string.Somalia);

        }else if( nomePais.equals("Suriname") ){

            this.NomePais = context.getString(R.string.Suriname);

        }else if( nomePais.equals("South Sudan") ){

            this.NomePais = context.getString(R.string.South_Sudan);

        }else if( nomePais.equals("Sao Tome and Principe") ){

            this.NomePais = context.getString(R.string.Sao_Tome_and_Principe);

        }else if( nomePais.equals("El Salvador") ){

            this.NomePais = context.getString(R.string.El_Salvador);

        }else if( nomePais.equals("Sint Maarten (Dutch Part)") ){

            this.NomePais = context.getString(R.string.Sint_Maarten_Dutch_Part);

        }else if( nomePais.equals("Syrian Arab Republic") ){

            this.NomePais = context.getString(R.string.Syrian_Arab_Republic);

        }else if( nomePais.equals("Swaziland") ){

            this.NomePais = context.getString(R.string.Swaziland);

        }else if( nomePais.equals("Turks and Caicos Islands") ){

            this.NomePais = context.getString(R.string.Turks_and_Caicos_Islands);

        }else if( nomePais.equals("Chad") ){

            this.NomePais = context.getString(R.string.Chad);

        }else if( nomePais.equals("French Southern Territories") ){

            this.NomePais = context.getString(R.string.French_Southern_Territories);

        }else if( nomePais.equals("Togo") ){

            this.NomePais = context.getString(R.string.Togo);

        }else if( nomePais.equals("Thailand") ){

            this.NomePais = context.getString(R.string.Thailand);

        }else if( nomePais.equals("Tajikistan") ){

            this.NomePais = context.getString(R.string.Tajikistan);

        }else if( nomePais.equals("Tokelau") ){

            this.NomePais = context.getString(R.string.Tokelau);

        }else if( nomePais.equals("Timor-Leste") ){

            this.NomePais = context.getString(R.string.Timor_Leste);

        }else if( nomePais.equals("Turkmenistan") ){

            this.NomePais = context.getString(R.string.Turkmenistan);

        }else if( nomePais.equals("Tunisia") ){

            this.NomePais = context.getString(R.string.Tunisia);

        }else if( nomePais.equals("Tonga") ){

            this.NomePais = context.getString(R.string.Tonga);

        }else if( nomePais.equals("Turkey") ){

            this.NomePais = context.getString(R.string.Turkey);

        }else if( nomePais.equals("Trinidad and Tobago") ){

            this.NomePais = context.getString(R.string.Trinidad_and_Tobago);

        }else if( nomePais.equals("Tuvalu") ){

            this.NomePais = context.getString(R.string.Tuvalu);

        }else if( nomePais.equals("Taiwan*") ){

            this.NomePais = context.getString(R.string.Taiwan);

        }else if( nomePais.equals("Tanzania") ){

            this.NomePais = context.getString(R.string.Tanzania);

        }else if( nomePais.equals("Ukraine") ){

            this.NomePais = context.getString(R.string.Ukraine);

        }else if( nomePais.equals("Uganda") ){

            this.NomePais = context.getString(R.string.Uganda);

        }else if( nomePais.equals("United States Minor Outlying Islands") ){

            this.NomePais = context.getString(R.string.United_States_Minor_Outlying_Islands);

        }else if( nomePais.equals("US") ){

            this.NomePais = context.getString(R.string.US);

        }else if( nomePais.equals("Uruguay") ){

            this.NomePais = context.getString(R.string.Uruguay);

        }else if( nomePais.equals("Uzbekistan") ){

            this.NomePais = context.getString(R.string.Uzbekistan);

        }else if( nomePais.equals("Holy See") ){

            this.NomePais = context.getString(R.string.Holy_See);

        }else if( nomePais.equals("Saint Vincent and The Grenadines") ){

            this.NomePais = context.getString(R.string.Saint_Vincent_and_The_Grenadines);

        }else if( nomePais.equals("Venezuela") ){

            this.NomePais = context.getString(R.string.Venezuela);

        }else if( nomePais.equals("Virgin Islands, British") ){

            this.NomePais = context.getString(R.string.Virgin_Islands_British);

        }else if( nomePais.equals("Virgin Islands, U.S.") ){

            this.NomePais = context.getString(R.string.Virgin_Islands_US);

        }else if( nomePais.equals("Vietnam") ){

            this.NomePais = context.getString(R.string.Vietnam);

        }else if( nomePais.equals("Vanuatu") ){

            this.NomePais = context.getString(R.string.Vanuatu);

        }else if( nomePais.equals("Wallis and Futuna") ){

            this.NomePais = context.getString(R.string.Wallis_and_Futuna);

        }else if( nomePais.equals("Samoa") ){

            this.NomePais = context.getString(R.string.Samoa);

        }else if( nomePais.equals("Kosovo") ){

            this.NomePais = context.getString(R.string.Kosovo);

        }else if( nomePais.equals("Yemen") ){

            this.NomePais = context.getString(R.string.Yemen);

        }else if( nomePais.equals("Mayotte") ){

            this.NomePais = context.getString(R.string.Mayotte);

        }else if( nomePais.equals("South Africa") ){

            this.NomePais = context.getString(R.string.South_Africa);

        }else if( nomePais.equals("Zambia") ){

            this.NomePais = context.getString(R.string.Zambia);

        }else if( nomePais.equals("Zimbabwe") ){

            this.NomePais = context.getString(R.string.Zimbabwe);

        }else{

            this.NomePais = nomePais;

        }

    }

    public int getNumConfirmados() {
        return numConfirmados;
    }

    public void setNumConfirmados(int numConfirmados) {
        this.numConfirmados = numConfirmados;
    }

    public int getMortes() {
        return mortes;
    }

    public void setMortes(int mortes) {
        this.mortes = mortes;
    }

    public int getRecuperacao() {
        return recuperacao;
    }

    public void setRecuperacao(int recuperacao) {
        this.recuperacao = recuperacao;
    }

    @NonNull
    @Override
    public String toString() {
        return "➤ " + this.NomePais
                + "\n"
                + "\n\uD83D\uDC80 " + context.getString(R.string.convertertoStringCasosGlobais) + " " + String.valueOf(mortes)
                + "\n☣️ " + context.getString(R.string.convertertoStringCasosGlobais1) + " " + String.valueOf(numConfirmados)
                + "\n♥ " + context.getString(R.string.convertertoStringCasosGlobais2) + " " +String.valueOf(recuperacao)
                + "\n⌚ " + context.getString(R.string.convertertoStringCasosGlobais3) + " " + dataUltimaAtualizacao
                + "\n";
    }
}
