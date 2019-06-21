package com.tencent.mm.plugin.avatar;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.bd;
import com.tencent.mm.vfs.e;
import java.io.File;

public final class a
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(79052);
    boolean bool;
    if (paramArrayOfString.length <= 1)
    {
      AppMethodBeat.o(79052);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.AvatarCommand", "processCommand: %s", new Object[] { TextUtils.join(" ", paramArrayOfString) });
      if (paramArrayOfString[1].equals("pull"))
      {
        if (paramArrayOfString.length <= 2)
        {
          AppMethodBeat.o(79052);
          bool = false;
        }
        else
        {
          paramArrayOfString = paramArrayOfString[2];
          String str1 = ((j)g.K(j.class)).XM().aoK(paramArrayOfString).field_username;
          paramContext = Environment.getExternalStorageDirectory().getAbsolutePath() + "/tencent/MicroMsg/avatar/";
          e.tf(paramContext);
          o.acd();
          String str2 = d.D(str1, false);
          paramString = e.cv(str2);
          e.y(str2, paramContext + paramArrayOfString + "-s." + paramString);
          o.acd();
          str1 = d.D(str1, true);
          paramString = e.cv(str1);
          e.y(str1, paramContext + paramArrayOfString + "-b." + paramString);
          Toast.makeText(ah.getContext(), "pull to ".concat(String.valueOf(paramContext)), 0).show();
          AppMethodBeat.o(79052);
          bool = true;
        }
      }
      else if (paramArrayOfString[1].equals("dump"))
      {
        if (paramArrayOfString.length <= 2)
        {
          AppMethodBeat.o(79052);
          bool = false;
        }
        else
        {
          paramContext = paramArrayOfString[2];
          paramContext = ((j)g.K(j.class)).XM().aoK(paramContext).field_username;
          paramContext = o.act().qo(paramContext);
          ab.i("MicroMsg.AvatarCommand", "dump: %s, %s, %s, %s", new Object[] { paramContext.ack(), paramContext.acl(), Integer.valueOf(paramContext.frU), Integer.valueOf(paramContext.dtR) });
          AppMethodBeat.o(79052);
          bool = true;
        }
      }
      else if (paramArrayOfString[1].equals("clean"))
      {
        if (paramArrayOfString.length <= 2)
        {
          AppMethodBeat.o(79052);
          bool = false;
        }
        else
        {
          paramContext = paramArrayOfString[2];
          paramContext = ((j)g.K(j.class)).XM().aoK(paramContext).field_username;
          o.acd();
          d.E(paramContext, false);
          o.acd();
          d.E(paramContext, true);
          AppMethodBeat.o(79052);
          bool = true;
        }
      }
      else if (paramArrayOfString[1].equals("cleanAll"))
      {
        e.N("wcf://avatar/", true);
        AppMethodBeat.o(79052);
        bool = true;
      }
      else if (paramArrayOfString[1].equals("decrypt"))
      {
        if (paramArrayOfString.length <= 2)
        {
          AppMethodBeat.o(79052);
          bool = false;
        }
        else
        {
          paramArrayOfString = paramArrayOfString[2];
          paramContext = UtilsJni.DecryptAvatar(e.e(paramArrayOfString, 0, -1));
          if (paramContext == null)
            Toast.makeText(ah.getContext(), "error", 0).show();
          while (true)
          {
            AppMethodBeat.o(79052);
            bool = true;
            break;
            e.b(paramArrayOfString + ".d", paramContext, paramContext.length);
          }
        }
      }
      else
      {
        AppMethodBeat.o(79052);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.avatar.a
 * JD-Core Version:    0.6.2
 */