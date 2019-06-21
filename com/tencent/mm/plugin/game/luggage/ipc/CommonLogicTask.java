package com.tencent.mm.plugin.game.luggage.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gu;
import com.tencent.mm.g.a.gu.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.game.d.dd;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.plugin.webview.model.ap;
import com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams;
import com.tencent.mm.plugin.webview.ui.tools.game.c;
import com.tencent.mm.pluginsdk.r;
import com.tencent.mm.pluginsdk.r.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;

public class CommonLogicTask extends MainProcessTask
{
  public static final Parcelable.Creator<CommonLogicTask> CREATOR;
  public Runnable mUa;
  public Bundle mqu;
  public int type;

  static
  {
    AppMethodBeat.i(135863);
    CREATOR = new CommonLogicTask.1();
    AppMethodBeat.o(135863);
  }

  public CommonLogicTask()
  {
    AppMethodBeat.i(135861);
    this.mqu = new Bundle();
    AppMethodBeat.o(135861);
  }

  CommonLogicTask(Parcel paramParcel)
  {
    AppMethodBeat.i(135862);
    this.mqu = new Bundle();
    g(paramParcel);
    AppMethodBeat.o(135862);
  }

  private static int vn(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(135858);
    try
    {
      j = bo.getInt(com.tencent.mm.m.g.Nu().getValue(paramString), 1);
      AppMethodBeat.o(135858);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ComonLogicTask", "getIntValFromDynamicConfig parseInt failed, val: ".concat(String.valueOf(paramString)));
        int j = i;
      }
    }
  }

  public final void asP()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    int i = 0;
    AppMethodBeat.i(135857);
    switch (this.type)
    {
    case 7:
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 8:
    case 9:
    case 10:
    case 11:
    }
    while (true)
    {
      aCb();
      AppMethodBeat.o(135857);
      Object localObject1;
      while (true)
      {
        return;
        if (this.mqu == null)
          break;
        bool2 = this.mqu.getBoolean("permission_allow", false);
        localObject1 = this.mqu.getString("url");
        if (bo.isNullOrNil((String)localObject1))
        {
          ab.e("MicroMsg.ComonLogicTask", "ACTIVITY_JUMP_HANDLER, url is null");
          AppMethodBeat.o(135857);
        }
        else
        {
          r.a.vax.a(ah.getContext(), (String)localObject1, bool2);
          break;
          if (this.mqu == null)
            break;
          localObject1 = this.mqu.getIntArray("getConfigStgKey");
          if ((localObject1 != null) && (localObject1.length != 0))
            break label190;
          AppMethodBeat.o(135857);
        }
      }
      label190: Object localObject2 = new ArrayList();
      int j = localObject1.length;
      while (i < j)
      {
        int k = localObject1[i];
        com.tencent.mm.kernel.g.RQ();
        ((ArrayList)localObject2).add(bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(k, null)));
        i++;
      }
      this.mqu.putStringArrayList("getConfigStgValue", (ArrayList)localObject2);
      continue;
      if (this.mqu != null)
      {
        localObject1 = this.mqu.getString("localId");
        localObject1 = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex((String)localObject1);
        if (localObject1 != null)
        {
          this.mqu.putParcelable("item", (Parcelable)localObject1);
          continue;
          i = vn("WebViewDownLoadFileSwitch");
          if (this.mqu == null)
            this.mqu = new Bundle();
          localObject1 = this.mqu;
          if (i == 1);
          while (true)
          {
            ((Bundle)localObject1).putBoolean("allowDownloadFile", bool2);
            break;
            bool2 = false;
          }
          i = vn("EnableWebviewScanQRCode");
          localObject1 = this.mqu;
          if (i == 1);
          for (bool2 = bool1; ; bool2 = false)
          {
            ((Bundle)localObject1).putBoolean("allow_webview_scan", bool2);
            break;
          }
          this.mqu.putBoolean("has_set_uin", com.tencent.mm.kernel.g.RK());
          continue;
          localObject1 = ap.aeC(this.mqu.getString("localId"));
          this.mqu.putString("file_path", (String)localObject1);
          continue;
          localObject2 = this.mqu.getString("game_hv_menu_appid");
          localObject1 = new gu();
          ((gu)localObject1).cBw.Cn = 3;
          ((gu)localObject1).cBw.cBy = ((String)localObject2);
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
          this.mqu.putString("game_hv_menu_pbcache", ((gu)localObject1).cBx.result);
          continue;
          localObject2 = com.tencent.mm.plugin.game.commlib.a.bDg();
          if (localObject2 != null)
          {
            localObject1 = new GameSettingParams();
            ((GameSettingParams)localObject1).uDr = ((dd)localObject2).color;
            ((GameSettingParams)localObject1).uDs = ((dd)localObject2).mYo;
            this.mqu.putParcelable("game_setting_params", (Parcelable)localObject1);
            continue;
            c.an(this.mqu);
          }
        }
      }
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(135856);
    if (this.mUa != null)
      this.mUa.run();
    AppMethodBeat.o(135856);
  }

  public int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(135860);
    this.type = paramParcel.readInt();
    this.mqu = paramParcel.readBundle(getClass().getClassLoader());
    AppMethodBeat.o(135860);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(135859);
    paramParcel.writeInt(this.type);
    paramParcel.writeBundle(this.mqu);
    AppMethodBeat.o(135859);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.ipc.CommonLogicTask
 * JD-Core Version:    0.6.2
 */