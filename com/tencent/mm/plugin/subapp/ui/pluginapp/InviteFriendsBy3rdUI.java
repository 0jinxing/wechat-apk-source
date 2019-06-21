package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.i.a.a;
import com.tencent.mm.ui.i.a.b;
import com.tencent.mm.ui.i.a.c;
import com.tencent.mm.ui.q;

public class InviteFriendsBy3rdUI extends MMPreference
  implements com.tencent.mm.ai.f, a.a, a.b
{
  private static int svo = 1;
  private static int svp = 2;
  private static int svq = 3;
  private static int svr = 4;
  private static int svs = 5;
  private static int svt = 0;
  private static int svu = 1;
  private ProgressDialog ehJ;
  private int fromScene;
  private ProgressBar mqj;
  private ProgressDialog nEK;
  private com.tencent.mm.ui.i.a rCx;
  private boolean svA;
  private boolean svB;
  private int svv;
  private Bitmap svw;
  private View svx;
  private ImageView svy;
  private EditText svz;

  public InviteFriendsBy3rdUI()
  {
    AppMethodBeat.i(25545);
    this.svv = 0;
    this.ehJ = null;
    this.nEK = null;
    this.svw = null;
    this.svy = null;
    this.mqj = null;
    this.svz = null;
    this.rCx = new com.tencent.mm.ui.i.a();
    this.svA = false;
    this.svB = false;
    AppMethodBeat.o(25545);
  }

  private void Fr(int paramInt)
  {
    AppMethodBeat.i(25550);
    com.tencent.mm.modelmulti.d locald = new com.tencent.mm.modelmulti.d(paramInt);
    getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131300968), true, new InviteFriendsBy3rdUI.8(this, locald));
    aw.Rg().a(locald, 0);
    AppMethodBeat.o(25550);
  }

  // ERROR //
  private static byte[] Pj(String paramString)
  {
    // Byte code:
    //   0: sipush 25556
    //   3: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 136	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   9: pop
    //   10: invokestatic 142	com/tencent/mm/model/c:XW	()Ljava/lang/String;
    //   13: astore_1
    //   14: invokestatic 136	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   17: pop
    //   18: aload_1
    //   19: invokestatic 145	com/tencent/mm/model/c:XX	()Ljava/lang/String;
    //   22: ldc 147
    //   24: aload_0
    //   25: invokevirtual 153	java/lang/String:getBytes	()[B
    //   28: invokestatic 159	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   31: ldc 161
    //   33: invokestatic 167	com/tencent/mm/sdk/platformtools/j:g	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   36: astore_0
    //   37: new 169	java/io/RandomAccessFile
    //   40: astore_1
    //   41: aload_1
    //   42: aload_0
    //   43: ldc 171
    //   45: invokespecial 174	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: aload_1
    //   49: astore_0
    //   50: aload_1
    //   51: invokevirtual 178	java/io/RandomAccessFile:length	()J
    //   54: l2i
    //   55: newarray byte
    //   57: astore_2
    //   58: aload_1
    //   59: astore_0
    //   60: aload_1
    //   61: aload_2
    //   62: invokevirtual 182	java/io/RandomAccessFile:read	([B)I
    //   65: pop
    //   66: aload_1
    //   67: invokevirtual 185	java/io/RandomAccessFile:close	()V
    //   70: sipush 25556
    //   73: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   76: aload_2
    //   77: astore_0
    //   78: aload_0
    //   79: areturn
    //   80: astore_2
    //   81: aconst_null
    //   82: astore_1
    //   83: aload_1
    //   84: astore_0
    //   85: ldc 187
    //   87: aload_2
    //   88: ldc 189
    //   90: iconst_0
    //   91: anewarray 191	java/lang/Object
    //   94: invokestatic 197	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   97: aload_1
    //   98: ifnull +7 -> 105
    //   101: aload_1
    //   102: invokevirtual 185	java/io/RandomAccessFile:close	()V
    //   105: sipush 25556
    //   108: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aconst_null
    //   112: astore_0
    //   113: goto -35 -> 78
    //   116: astore_1
    //   117: aconst_null
    //   118: astore_0
    //   119: aload_0
    //   120: ifnull +7 -> 127
    //   123: aload_0
    //   124: invokevirtual 185	java/io/RandomAccessFile:close	()V
    //   127: sipush 25556
    //   130: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: aload_1
    //   134: athrow
    //   135: astore_0
    //   136: goto -66 -> 70
    //   139: astore_0
    //   140: goto -35 -> 105
    //   143: astore_0
    //   144: goto -17 -> 127
    //   147: astore_1
    //   148: goto -29 -> 119
    //   151: astore_2
    //   152: goto -69 -> 83
    //
    // Exception table:
    //   from	to	target	type
    //   37	48	80	java/lang/Exception
    //   37	48	116	finally
    //   66	70	135	java/lang/Exception
    //   101	105	139	java/lang/Exception
    //   123	127	143	java/lang/Exception
    //   50	58	147	finally
    //   60	66	147	finally
    //   85	97	147	finally
    //   50	58	151	java/lang/Exception
    //   60	66	151	java/lang/Exception
  }

  private static boolean aD(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(25551);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(25551);
    while (true)
    {
      return bool;
      try
      {
        paramContext.getPackageManager().getApplicationInfo(paramString, 8192);
        bool = true;
        AppMethodBeat.o(25551);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        AppMethodBeat.o(25551);
      }
    }
  }

  private static void abr(String paramString)
  {
    AppMethodBeat.i(25557);
    aw.ZK();
    paramString = new com.tencent.mm.bb.a(paramString, bo.h((Integer)c.Ry().get(66561, null)));
    aw.Rg().a(paramString, 0);
    AppMethodBeat.o(25557);
  }

  private static Bitmap bIu()
  {
    AppMethodBeat.i(25555);
    Object localObject = Pj(r.Yz());
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(25555);
    }
    while (true)
    {
      return localObject;
      localObject = com.tencent.mm.sdk.platformtools.d.bQ((byte[])localObject);
      AppMethodBeat.o(25555);
    }
  }

  private void w(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(25554);
    this.svx = View.inflate(this.mController.ylL, 2130969183, null);
    this.svz = ((EditText)this.svx.findViewById(2131822921));
    this.svy = ((ImageView)this.svx.findViewById(2131822920));
    this.mqj = ((ProgressBar)this.svx.findViewById(2131821605));
    ((View)this.svy.getParent()).setVisibility(8);
    this.svz.setText(paramString1);
    this.svw = bIu();
    if (this.svw == null)
    {
      abr(r.Yz());
      ((ProgressBar)this.svx.findViewById(2131821605)).setVisibility(0);
    }
    while (true)
    {
      com.tencent.mm.pluginsdk.ui.applet.g.a(this.mController, paramString2, this.svx, getResources().getString(2131297041), new InviteFriendsBy3rdUI.2(this, paramString1, paramInt));
      AppMethodBeat.o(25554);
      return;
      if (this.svy != null)
        this.svy.setImageBitmap(this.svw);
    }
  }

  private void xv(int paramInt)
  {
    AppMethodBeat.i(25552);
    com.tencent.mm.ui.base.h.a(this.mController.ylL, paramInt, 2131297061, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    }
    , new InviteFriendsBy3rdUI.11(this));
    AppMethodBeat.o(25552);
  }

  public final int JC()
  {
    return 2131165244;
  }

  public final void a(a.c paramc)
  {
    AppMethodBeat.i(25553);
    if (this.nEK != null)
      this.nEK.cancel();
    switch (InviteFriendsBy3rdUI.3.nFi[paramc.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(25553);
      while (true)
      {
        return;
        xv(2131304134);
        AppMethodBeat.o(25553);
        continue;
        AppMethodBeat.o(25553);
      }
      xv(2131304133);
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(25548);
    if ("invite_friends_by_message".equals(paramPreference.mKey))
    {
      this.svv = svp;
      Fr(2);
      AppMethodBeat.o(25548);
    }
    while (true)
    {
      return bool;
      if ("invite_friends_by_mail".equals(paramPreference.mKey))
      {
        this.svv = svo;
        Fr(1);
        AppMethodBeat.o(25548);
      }
      else if ("invite_friends_by_whatsapp".equals(paramPreference.mKey))
      {
        this.svv = svq;
        Fr(4);
        AppMethodBeat.o(25548);
      }
      else
      {
        if ("invite_friends_by_facebook".equals(paramPreference.mKey))
        {
          this.svv = svr;
          if (r.Za())
          {
            this.svB = true;
            Fr(8);
          }
          while (true)
          {
            AppMethodBeat.o(25548);
            break;
            com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131303084, 2131297061, new InviteFriendsBy3rdUI.4(this), new InviteFriendsBy3rdUI.5(this));
          }
        }
        if ("invite_friends_by_twitter".equals(paramPreference.mKey))
        {
          this.svv = svs;
          if (this.rCx.dKv())
          {
            this.svA = true;
            Fr(16);
          }
          while (true)
          {
            AppMethodBeat.o(25548);
            break;
            com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131303322, 2131297061, new InviteFriendsBy3rdUI.6(this), new InviteFriendsBy3rdUI.7(this));
          }
        }
        bool = false;
        AppMethodBeat.o(25548);
      }
    }
  }

  public final void b(a.c paramc)
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25546);
    super.onCreate(paramBundle);
    setMMTitle(2131299805);
    this.fromScene = getIntent().getIntExtra("Invite_friends", 4);
    int i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("InviteFriendsInviteFlags"), 0);
    paramBundle = this.yCw;
    if ((i & 0x2) <= 0)
      paramBundle.aqP("invite_friends_by_message");
    if ((i & 0x1) <= 0)
      paramBundle.aqP("invite_friends_by_mail");
    if (((i & 0x4) <= 0) || (!aD(this.mController.ylL, "com.whatsapp")))
      paramBundle.aqP("invite_friends_by_whatsapp");
    if (((i & 0x8) <= 0) || (!r.YX()))
      paramBundle.aqP("invite_friends_by_facebook");
    if ((i & 0x10) <= 0)
      paramBundle.aqP("invite_friends_by_twitter");
    paramBundle.notifyDataSetChanged();
    aw.Rg().a(1803, this);
    aw.Rg().a(1804, this);
    aw.Rg().a(168, this);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(25538);
        InviteFriendsBy3rdUI.this.finish();
        AppMethodBeat.o(25538);
        return true;
      }
    });
    AppMethodBeat.o(25546);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(25547);
    aw.Rg().b(1803, this);
    aw.Rg().b(1804, this);
    aw.Rg().b(168, this);
    if (this.svv == 0)
      com.tencent.mm.plugin.report.service.h.pYm.e(14035, new Object[] { Integer.valueOf(this.svv), Integer.valueOf(svt), Integer.valueOf(this.fromScene) });
    super.onDestroy();
    AppMethodBeat.o(25547);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(25549);
    ab.i("MicroMsg.InviteFriendsBy3rdUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
      com.tencent.mm.plugin.report.service.h.pYm.e(14035, new Object[] { Integer.valueOf(this.svv), Integer.valueOf(svt), Integer.valueOf(this.fromScene) });
    if (paramm.getType() == 1803)
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        com.tencent.mm.ui.base.h.g(this.mController.ylL, 2131300966, 2131297061);
        AppMethodBeat.o(25549);
      }
    while (true)
    {
      return;
      paramString = (com.tencent.mm.modelmulti.d)paramm;
      Object localObject1;
      label178: label196: int i;
      if (bo.isNullOrNil(paramString.title))
      {
        localObject1 = null;
        paramString = (com.tencent.mm.modelmulti.d)paramm;
        if (!bo.isNullOrNil(paramString.content))
          break label888;
        paramString = null;
        String str = r.YA();
        aw.ZK();
        Object localObject2 = (String)c.Ry().get(6, null);
        Object localObject3 = str;
        if (bo.isNullOrNil(str))
          localObject3 = localObject2;
        i = ((com.tencent.mm.modelmulti.d)paramm).fHT;
        localObject2 = paramString;
        if ((i & 0x1) > 0)
        {
          localObject2 = localObject1;
          if (bo.isNullOrNil((String)localObject1))
            localObject2 = String.format(getString(2131300650), new Object[] { r.YB() });
          localObject1 = paramString;
          if (bo.isNullOrNil(paramString))
            localObject1 = String.format(getString(2131300649), new Object[] { localObject3 });
          paramString = new Intent("android.intent.action.SEND");
          paramString.putExtra("android.intent.extra.SUBJECT", (String)localObject2);
          paramString.putExtra("android.intent.extra.TEXT", (String)localObject1);
          paramString.setType("plain/text");
          startActivity(Intent.createChooser(paramString, getString(2131300643)));
          com.tencent.mm.plugin.report.service.h.pYm.e(14035, new Object[] { Integer.valueOf(this.svv), Integer.valueOf(svu), Integer.valueOf(this.fromScene) });
          localObject2 = localObject1;
        }
        localObject1 = localObject2;
        if ((i & 0x2) > 0)
        {
          localObject1 = localObject2;
          if (bo.isNullOrNil((String)localObject2))
            localObject1 = String.format(getString(2131300651), new Object[] { localObject3 });
          paramString = new Intent("android.intent.action.VIEW");
          paramString.putExtra("sms_body", (String)localObject1);
          paramString.setType("vnd.android-dir/mms-sms");
          if (!bo.k(this, paramString))
            break label896;
          startActivity(paramString);
          label506: com.tencent.mm.plugin.report.service.h.pYm.e(14035, new Object[] { Integer.valueOf(this.svv), Integer.valueOf(svu), Integer.valueOf(this.fromScene) });
        }
        paramString = (String)localObject1;
        if ((i & 0x4) > 0)
        {
          paramString = (String)localObject1;
          if (bo.isNullOrNil((String)localObject1))
            paramString = String.format(getString(2131300651), new Object[] { localObject3 });
          localObject1 = new Intent();
          ((Intent)localObject1).setAction("android.intent.action.SEND");
          ((Intent)localObject1).putExtra("android.intent.extra.TEXT", paramString);
          ((Intent)localObject1).setType("text/plain");
          ((Intent)localObject1).setPackage("com.whatsapp");
          startActivity((Intent)localObject1);
          com.tencent.mm.plugin.report.service.h.pYm.e(14035, new Object[] { Integer.valueOf(this.svv), Integer.valueOf(svu), Integer.valueOf(this.fromScene) });
        }
        localObject2 = paramString;
        if ((i & 0x8) > 0)
        {
          localObject1 = paramString;
          if (bo.isNullOrNil(paramString))
          {
            if (!bo.isNullOrNil(r.YA()))
              break label910;
            localObject1 = getString(2131300648);
          }
          label722: paramString = getString(2131300640);
          localObject2 = localObject1;
          if (this.svB == true)
          {
            w(i, (String)localObject1, paramString);
            this.svB = false;
            localObject2 = localObject1;
          }
        }
        if ((i & 0x10) > 0)
        {
          this.rCx.a(this);
          paramString = (String)localObject2;
          if (bo.isNullOrNil((String)localObject2))
            if (!bo.isNullOrNil(r.YA()))
              break label935;
        }
      }
      label896: label910: label935: for (paramString = getString(2131300648); ; paramString = String.format(getString(2131300647), new Object[] { r.YA() }))
      {
        localObject1 = getString(2131300645);
        if (this.svA == true)
        {
          w(i, paramString, (String)localObject1);
          this.svA = false;
        }
        if (paramm.getType() != 1804)
          break label1016;
        if ((paramInt1 == 0) && (paramInt2 == 0))
          break label959;
        com.tencent.mm.ui.base.h.g(this.mController.ylL, 2131302960, 2131297061);
        AppMethodBeat.o(25549);
        break;
        localObject1 = paramString.title;
        break label178;
        label888: paramString = paramString.content;
        break label196;
        Toast.makeText(this, 2131302910, 1).show();
        break label506;
        localObject1 = String.format(getString(2131300647), new Object[] { r.YA() });
        break label722;
      }
      label959: com.tencent.mm.ui.base.h.bQ(this, getResources().getString(2131298422));
      com.tencent.mm.plugin.report.service.h.pYm.e(14035, new Object[] { Integer.valueOf(this.svv), Integer.valueOf(svu), Integer.valueOf(this.fromScene) });
      label1016: if (paramm.getType() == 168)
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          AppMethodBeat.o(25549);
        }
        else if (this.svy != null)
        {
          if (this.mqj != null)
            this.mqj.setVisibility(8);
          this.svy.setImageBitmap(bIu());
        }
      }
      else
        AppMethodBeat.o(25549);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI
 * JD-Core Version:    0.6.2
 */