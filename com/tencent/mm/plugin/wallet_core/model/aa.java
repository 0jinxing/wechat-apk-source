package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fe;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONObject;

public final class aa extends fe
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(46911);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wallet_tpa_country";
    locala.xDd.put("wallet_tpa_country", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" wallet_tpa_country TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "wallet_tpa_country";
    locala.columns[1] = "wallet_type";
    locala.xDd.put("wallet_type", "INTEGER");
    localStringBuilder.append(" wallet_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "wallet_name";
    locala.xDd.put("wallet_name", "TEXT");
    localStringBuilder.append(" wallet_name TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "wallet_selected";
    locala.xDd.put("wallet_selected", "INTEGER");
    localStringBuilder.append(" wallet_selected INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "wallet_balance";
    locala.xDd.put("wallet_balance", "INTEGER");
    localStringBuilder.append(" wallet_balance INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "wallet_tpa_country_mask";
    locala.xDd.put("wallet_tpa_country_mask", "INTEGER");
    localStringBuilder.append(" wallet_tpa_country_mask INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(46911);
  }

  public static aa aD(JSONObject paramJSONObject)
  {
    Object localObject = null;
    AppMethodBeat.i(46910);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.WalletKindInfo", "json is null");
      AppMethodBeat.o(46910);
      paramJSONObject = localObject;
    }
    while (true)
    {
      return paramJSONObject;
      aa localaa = new aa();
      localaa.field_wallet_tpa_country = paramJSONObject.optString("wallet_tpa_country");
      localaa.field_wallet_name = paramJSONObject.optString("wallet_name");
      localaa.field_wallet_selected = paramJSONObject.optInt("wallet_selected");
      localaa.field_wallet_type = paramJSONObject.optInt("wallet_type");
      localaa.field_wallet_balance = paramJSONObject.optInt("wallet_balance");
      localaa.field_wallet_tpa_country_mask = paramJSONObject.optInt("wallet_tpa_country_mask");
      if (bo.isNullOrNil(localaa.field_wallet_tpa_country))
      {
        ab.e("MicroMsg.WalletKindInfo", "wallet_id is illegal");
        AppMethodBeat.o(46910);
        paramJSONObject = localObject;
      }
      else
      {
        AppMethodBeat.o(46910);
        paramJSONObject = localaa;
      }
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.aa
 * JD-Core Version:    0.6.2
 */