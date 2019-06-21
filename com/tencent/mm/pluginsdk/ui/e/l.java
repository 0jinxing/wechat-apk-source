package com.tencent.mm.pluginsdk.ui.e;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Toast;
import com.tencent.mars.comm.PlatformComm.C2Java;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bck;
import com.tencent.mm.protocal.protobuf.bkf;
import com.tencent.mm.protocal.protobuf.bkg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.k;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class l
{
  static String vsa;

  private static void a(Activity paramActivity, ad paramad, String paramString, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(28151);
    bck localbck = new bck();
    localbck.wGA = paramString;
    bkg localbkg = new bkg();
    localbkg.jBv = paramArrayList.size();
    localbkg.wNu = new LinkedList();
    Iterator localIterator = paramArrayList.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localObject = new bkf();
      ((bkf)localObject).wNt = str;
      localbkg.wNu.add(localObject);
    }
    localbck.wGw = localbkg;
    ((j)g.K(j.class)).XL().c(new j.a(60, localbck));
    paramString = ((j)g.K(j.class)).XM().aoO(paramString);
    if ((paramString != null) && ((int)paramString.ewQ > 0) && (com.tencent.mm.n.a.jh(paramString.field_type)))
    {
      paramArrayList = paramArrayList.iterator();
      for (paramString = ""; paramArrayList.hasNext(); paramString = paramString + ",")
      {
        localObject = (String)paramArrayList.next();
        paramString = paramString + (String)localObject;
      }
      paramad.jd(paramString);
      ((j)g.K(j.class)).XM().Y(paramad);
    }
    Toast.makeText(paramActivity, paramActivity.getString(2131303968), 0).show();
    AppMethodBeat.o(28151);
  }

  public static void a(Context paramContext, String paramString, DialogInterface.OnDismissListener paramOnDismissListener, Bundle paramBundle)
  {
    AppMethodBeat.i(28147);
    if (!(paramContext instanceof Activity))
      ab.w("MicroMsg.MailPhoneMenuHelper", "context should be Activity, %s", new Object[] { bo.dpG() });
    if (g.RN().QY());
    label398: label409: for (boolean bool = ((Boolean)g.RP().Ry().get(ac.a.xLB, Boolean.FALSE)).booleanValue(); ; bool = false)
    {
      int i;
      if (paramBundle != null)
      {
        i = paramBundle.getInt("fromScene");
        if (!dlf())
          break label660;
        if (paramBundle != null)
          break label398;
        localObject = "";
        label89: localObject = bo.nullAsNil((String)localObject);
        if ((localObject != null) && (localObject != "") && (!r.mG((String)localObject)) && (!ad.aox((String)localObject)))
          break label460;
        if (!bool)
          break label409;
        localObject = new String[4];
        localObject[0] = paramContext.getResources().getString(2131298201);
        localObject[1] = paramContext.getResources().getString(2131298202);
        localObject[2] = paramContext.getResources().getString(2131298195);
        localObject[3] = paramContext.getResources().getString(2131298193);
      }
      label191: for (Object localObject = bo.P((String[])localObject); ; localObject = bo.P(new String[] { paramContext.getResources().getString(2131298201), paramContext.getResources().getString(2131298195) }))
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(11621, new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
        if (q.BX())
        {
          ((List)localObject).add(paramContext.getResources().getString(2131298197));
          com.tencent.mm.plugin.report.service.h.pYm.e(11621, new Object[] { Integer.valueOf(i), Integer.valueOf(3) });
          if (PlatformComm.C2Java.isNetworkConnected())
            q.dli();
        }
        k localk = new k(paramContext);
        localk.setTitle(paramString);
        l.a locala = new l.a((List)localObject, paramContext, paramOnDismissListener, paramBundle);
        locala.vsi = new l.5(localk, paramOnDismissListener);
        localk.khG = locala;
        com.tencent.mm.ui.base.h.a(paramContext, localk);
        localk.setOnCancelListener(new l.6(paramOnDismissListener));
        localk.vtI = new l.7(paramString, (List)localObject, paramContext, localk, paramOnDismissListener, i, paramBundle);
        localk.show();
        AppMethodBeat.o(28147);
        while (true)
        {
          return;
          i = 0;
          break;
          localObject = paramBundle.getString("Contact_User");
          break label89;
          localObject = new String[3];
          localObject[0] = paramContext.getResources().getString(2131298201);
          localObject[1] = paramContext.getResources().getString(2131298195);
          localObject[2] = paramContext.getResources().getString(2131298193);
          break label191;
          label460: localObject = ((j)g.K(j.class)).XM().aoO((String)localObject);
          if (localObject != null)
            break label496;
          AppMethodBeat.o(28147);
        }
        label496: localObject = ((ad)localObject).Oj();
        vsa = paramContext.getResources().getString(2131298194, new Object[] { localObject });
        if (bool)
        {
          localObject = new String[5];
          localObject[0] = paramContext.getResources().getString(2131298201);
          localObject[1] = paramContext.getResources().getString(2131298202);
          localObject[2] = vsa;
          localObject[3] = paramContext.getResources().getString(2131298195);
          localObject[4] = paramContext.getResources().getString(2131298193);
          break label191;
        }
        localObject = new String[4];
        localObject[0] = paramContext.getResources().getString(2131298201);
        localObject[1] = vsa;
        localObject[2] = paramContext.getResources().getString(2131298195);
        localObject[3] = paramContext.getResources().getString(2131298193);
        break label191;
      }
    }
  }

  public static void b(final Context paramContext, final String paramString, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    AppMethodBeat.i(28146);
    int i;
    if ((r.YK() & 0x1) == 0)
    {
      i = 1;
      if (i == 0)
        break label60;
      com.tencent.mm.ui.base.h.a(paramContext, paramString, paramContext.getResources().getStringArray(2131755014), "", new l.1(paramOnDismissListener, paramString, paramContext));
      AppMethodBeat.o(28146);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label60: String str = paramContext.getResources().getString(2131298087);
      paramOnDismissListener = new h.c()
      {
        public final void iE(int paramAnonymousInt)
        {
          AppMethodBeat.i(28132);
          if (this.vsb != null)
            this.vsb.onDismiss(null);
          String str = paramString.replace(" ", "").replace("#", "@");
          switch (paramAnonymousInt)
          {
          default:
          case 0:
          }
          while (true)
          {
            AppMethodBeat.o(28132);
            return;
            l.bC(paramContext, str);
          }
        }
      };
      com.tencent.mm.ui.base.h.a(paramContext, paramString, new String[] { str }, "", paramOnDismissListener);
      AppMethodBeat.o(28146);
    }
  }

  private static boolean dlf()
  {
    AppMethodBeat.i(28148);
    boolean bool;
    if ((dlg()) || (dlh()))
    {
      bool = true;
      AppMethodBeat.o(28148);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28148);
    }
  }

  static boolean dlg()
  {
    AppMethodBeat.i(28149);
    Context localContext = ah.getContext();
    Intent localIntent = new Intent("android.intent.action.INSERT");
    localIntent.setType("vnd.android.cursor.dir/contact");
    localIntent.putExtra("phone", "10086");
    boolean bool = bo.k(localContext, localIntent);
    AppMethodBeat.o(28149);
    return bool;
  }

  static boolean dlh()
  {
    AppMethodBeat.i(28150);
    boolean bool = bo.k(ah.getContext(), new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI));
    AppMethodBeat.o(28150);
    return bool;
  }

  public static abstract interface a$a
  {
    public abstract void iv(boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.l
 * JD-Core Version:    0.6.2
 */