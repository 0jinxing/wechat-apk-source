package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class AppProfileUI$1
  implements AppHeaderPreference.a
{
  AppProfileUI$1(AppProfileUI paramAppProfileUI)
  {
  }

  public final String cDK()
  {
    AppMethodBeat.i(25448);
    String str = g.b(this.suG.mController.ylL, AppProfileUI.a(this.suG), null);
    AppMethodBeat.o(25448);
    return str;
  }

  public final Bitmap cDL()
  {
    AppMethodBeat.i(25449);
    Bitmap localBitmap = g.b(AppProfileUI.a(this.suG).field_appId, 1, a.getDensity(this.suG));
    AppMethodBeat.o(25449);
    return localBitmap;
  }

  public final String getHint()
  {
    AppMethodBeat.i(25451);
    Object localObject1 = this.suG.mController.ylL;
    Object localObject2 = AppProfileUI.a(this.suG);
    if ((localObject1 == null) || (localObject2 == null))
    {
      localObject2 = null;
      AppMethodBeat.o(25451);
    }
    while (true)
    {
      return localObject2;
      localObject1 = g.fK((Context)localObject1);
      if (((String)localObject1).equalsIgnoreCase("zh_CN"))
      {
        localObject2 = ((f)localObject2).field_appDiscription;
        AppMethodBeat.o(25451);
      }
      else if ((((String)localObject1).equalsIgnoreCase("zh_TW")) || (((String)localObject1).equalsIgnoreCase("zh_HK")))
      {
        if (bo.isNullOrNil(((f)localObject2).field_appDiscription_tw))
        {
          localObject2 = ((f)localObject2).field_appDiscription;
          AppMethodBeat.o(25451);
        }
        else
        {
          localObject2 = ((f)localObject2).field_appDiscription_tw;
          AppMethodBeat.o(25451);
        }
      }
      else if (((String)localObject1).equalsIgnoreCase("en"))
      {
        if (bo.isNullOrNil(((f)localObject2).field_appDiscription_en))
        {
          localObject2 = ((f)localObject2).field_appDiscription;
          AppMethodBeat.o(25451);
        }
        else
        {
          localObject2 = ((f)localObject2).field_appDiscription_en;
          AppMethodBeat.o(25451);
        }
      }
      else if (bo.isNullOrNil(((f)localObject2).field_appDiscription_en))
      {
        localObject2 = ((f)localObject2).field_appDiscription;
        AppMethodBeat.o(25451);
      }
      else
      {
        localObject2 = ((f)localObject2).field_appDiscription_en;
        AppMethodBeat.o(25451);
      }
    }
  }

  public final String lY(boolean paramBoolean)
  {
    AppMethodBeat.i(25450);
    if (paramBoolean);
    for (int i = 2131303211; ; i = 2131303219)
    {
      String str = this.suG.mController.ylL.getString(i);
      AppMethodBeat.o(25450);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI.1
 * JD-Core Version:    0.6.2
 */