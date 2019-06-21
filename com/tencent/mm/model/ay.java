package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.y;

public final class ay
{
  public static SharedPreferences ZQ()
  {
    AppMethodBeat.i(58105);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("auth_info_key_prefs", h.Mu());
    if (!localSharedPreferences.getBoolean("key_auth_info_prefs_created", false))
    {
      e.pXa.a(148L, 12L, 1L, true);
      Object localObject1 = new y(ac.eSj + "autoauth.cfg");
      if ((!((y)localObject1).xIr) && (((y)localObject1).get(3) != null))
      {
        localObject2 = localSharedPreferences.edit();
        ((SharedPreferences.Editor)localObject2).putBoolean("key_auth_info_prefs_created", true);
        ((SharedPreferences.Editor)localObject2).putInt("key_auth_update_version", ((Integer)((y)localObject1).get(1)).intValue());
        ((SharedPreferences.Editor)localObject2).putInt("_auth_uin", ((Integer)((y)localObject1).get(2)).intValue());
        ((SharedPreferences.Editor)localObject2).putString("_auth_key", (String)((y)localObject1).get(3));
        ((SharedPreferences.Editor)localObject2).putString("server_id", (String)((y)localObject1).get(4));
        ab.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! use autoauthcfg now commit[%b] create[%b], ver[%d], uin[%d], aak[%s], sid[%s]", new Object[] { Boolean.valueOf(((SharedPreferences.Editor)localObject2).commit()), Boolean.valueOf(localSharedPreferences.getBoolean("key_auth_info_prefs_created", false)), Integer.valueOf(localSharedPreferences.getInt("key_auth_update_version", 0)), Integer.valueOf(localSharedPreferences.getInt("_auth_uin", 0)), localSharedPreferences.getString("_auth_key", ""), localSharedPreferences.getString("server_id", "") });
        e.pXa.a(148L, 51L, 1L, true);
        AppMethodBeat.o(58105);
        return localSharedPreferences;
      }
      Object localObject2 = ah.getContext().getSharedPreferences("auto_auth_key_prefs", h.Mu());
      localObject1 = localSharedPreferences.edit();
      if (bo.isNullOrNil(((SharedPreferences)localObject2).getString("_auth_key", "")))
        break label526;
      ((SharedPreferences.Editor)localObject1).putBoolean("key_auth_info_prefs_created", true);
      ((SharedPreferences.Editor)localObject1).putInt("key_auth_update_version", ((SharedPreferences)localObject2).getInt("key_auth_update_version", 0));
      ((SharedPreferences.Editor)localObject1).putInt("_auth_uin", ((SharedPreferences)localObject2).getInt("_auth_uin", 0));
      ((SharedPreferences.Editor)localObject1).putString("_auth_key", ((SharedPreferences)localObject2).getString("_auth_key", ""));
      ((SharedPreferences.Editor)localObject1).putString("server_id", ah.getContext().getSharedPreferences("server_id_prefs", h.Mu()).getString("server_id", ""));
      ab.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! use oldAAKsp now commit[%b] create[%b], ver[%d], uin[%d], aak[%s], sid[%s]", new Object[] { Boolean.valueOf(((SharedPreferences.Editor)localObject1).commit()), Boolean.valueOf(localSharedPreferences.getBoolean("key_auth_info_prefs_created", false)), Integer.valueOf(localSharedPreferences.getInt("key_auth_update_version", 0)), Integer.valueOf(localSharedPreferences.getInt("_auth_uin", 0)), localSharedPreferences.getString("_auth_key", ""), localSharedPreferences.getString("server_id", "") });
    }
    while (true)
    {
      AppMethodBeat.o(58105);
      break;
      label526: ab.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! neither autoauthcfg nor oldAAKsp existed just install! stack[%s]", new Object[] { bo.dpG() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ay
 * JD-Core Version:    0.6.2
 */