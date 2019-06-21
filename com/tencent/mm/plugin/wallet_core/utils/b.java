package com.tencent.mm.plugin.wallet_core.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import org.json.JSONObject;

public final class b
{
  public static void aK(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48007);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData() json is null");
      AppMethodBeat.o(48007);
      return;
    }
    ab.i("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData()");
    String str1 = "";
    String str2 = "";
    int i = paramJSONObject.optInt("is_open_sns_pay", 0);
    int j = paramJSONObject.optInt("can_open_sns_pay", 0);
    int k = paramJSONObject.optInt("is_white_user", 0);
    if (j == 1)
    {
      str1 = paramJSONObject.optString("open_sns_pay_title");
      str2 = paramJSONObject.optString("open_sns_pay_wording");
      g.RQ();
      g.RP().Ry().set(ac.a.xNh, str1);
      g.RQ();
      g.RP().Ry().set(ac.a.xNi, str2);
    }
    ab.i("MicroMsg.WalletNetSceneUtil", "is_open_sns_pay:" + i + ", can_open_sns_pay:" + j + ", is_white_user:" + k);
    ab.i("MicroMsg.WalletNetSceneUtil", "open_sns_pay_title:" + str1 + ", open_sns_pay_wording:" + str2);
    g.RQ();
    g.RP().Ry().set(ac.a.xNe, Integer.valueOf(i));
    g.RQ();
    g.RP().Ry().set(ac.a.xNf, Integer.valueOf(j));
    g.RQ();
    g.RP().Ry().set(ac.a.xNg, Integer.valueOf(k));
    if (k == 1)
    {
      str1 = paramJSONObject.optString("set_sns_pay_title");
      paramJSONObject = paramJSONObject.optString("set_sns_pay_wording");
      g.RQ();
      g.RP().Ry().set(ac.a.xNj, str1);
      g.RQ();
      g.RP().Ry().set(ac.a.xNk, paramJSONObject);
    }
    while (true)
    {
      ab.i("MicroMsg.WalletNetSceneUtil", "set_sns_pay_title:" + str1 + ", set_sns_pay_wording:" + paramJSONObject);
      g.RQ();
      g.RP().Ry().dsb();
      AppMethodBeat.o(48007);
      break;
      paramJSONObject = "";
      str1 = "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.b
 * JD-Core Version:    0.6.2
 */