package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.m.e;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.a.e.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SeeRoomMemberUI extends MMActivity
  implements f
{
  private static int elW = 5;
  private int Lp;
  private boolean cEH;
  private boolean ehL;
  private u eih;
  private String ejD;
  private String ejR;
  private int ejS;
  private String ejT;
  private boolean ejU;
  private com.tencent.mm.ui.base.p ejZ;
  private SeeRoomMemberUI.b elP;
  private String elQ;
  private String elR;
  private o elS;
  private String elT;
  private MMEditText elU;
  private int elV;
  private GridView ely;
  private String mTitle;
  private String talker;
  private String username;

  private static boolean JI()
  {
    boolean bool = true;
    AppMethodBeat.i(104348);
    if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("ChatroomGlobalSwitch"), 1) == 1)
      AppMethodBeat.o(104348);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104348);
    }
  }

  private void Kn()
  {
    AppMethodBeat.i(104339);
    ag localag = ((c)com.tencent.mm.kernel.g.K(c.class)).XV();
    if (this.talker == null);
    for (Object localObject = this.ejD; ; localObject = this.talker)
    {
      this.eih = localag.oa((String)localObject);
      localObject = n.my(this.ejD);
      if (this.elP != null)
        this.elP.Q((List)localObject);
      AppMethodBeat.o(104339);
      return;
    }
  }

  private List<String> Ko()
  {
    AppMethodBeat.i(104342);
    Object localObject = new LinkedList();
    if (!bo.isNullOrNil(this.elQ))
      localObject = bo.P(this.elQ.split(","));
    while (true)
    {
      bq localbq = ((j)com.tencent.mm.kernel.g.K(j.class)).XU().RA("@t.qq.com");
      if (localbq != null)
        ((List)localObject).add(localbq.name);
      AppMethodBeat.o(104342);
      return localObject;
    }
  }

  private static List<String> O(List<String> paramList)
  {
    AppMethodBeat.i(104349);
    LinkedList localLinkedList = new LinkedList();
    if (!com.tencent.mm.kernel.g.RK())
      AppMethodBeat.o(104349);
    while (true)
    {
      return localLinkedList;
      if (paramList == null)
      {
        AppMethodBeat.o(104349);
      }
      else
      {
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          ad localad = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(str);
          paramList = str;
          if (localad != null)
          {
            paramList = str;
            if ((int)localad.ewQ != 0)
              paramList = localad.Oj();
          }
          localLinkedList.add(paramList);
        }
        AppMethodBeat.o(104349);
      }
    }
  }

  protected static String a(u paramu, String paramString)
  {
    AppMethodBeat.i(104351);
    if (paramu == null)
    {
      paramu = "";
      AppMethodBeat.o(104351);
    }
    while (true)
    {
      return paramu;
      paramu = paramu.mJ(paramString);
      AppMethodBeat.o(104351);
    }
  }

  private void b(final String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(104346);
    if (!com.tencent.mm.model.m.mo(paramString1))
    {
      com.tencent.mm.ui.base.h.b(this, getString(2131302573), getString(2131297061), true);
      AppMethodBeat.o(104346);
    }
    while (true)
    {
      return;
      if (kh(paramString1))
      {
        com.tencent.mm.ui.base.h.b(this, getString(2131296416), getString(2131297061), true);
        AppMethodBeat.o(104346);
      }
      else
      {
        paramString1 = bo.P(paramString1.split(","));
        if (paramString1 == null)
        {
          AppMethodBeat.o(104346);
        }
        else
        {
          paramString1 = com.tencent.mm.roomsdk.a.b.alY(this.ejD).a(this.ejD, paramString1, paramString2);
          paramString1.d(new SeeRoomMemberUI.2(this));
          getString(2131297061);
          paramString1.a(this, getString(paramInt), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              AppMethodBeat.i(104310);
              paramString1.cancel();
              AppMethodBeat.o(104310);
            }
          });
          AppMethodBeat.o(104346);
        }
      }
    }
  }

  private static int bz(Context paramContext)
  {
    AppMethodBeat.i(104337);
    int i = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getWidth();
    int j = (int)(paramContext.getResources().getDimension(2131427796) * 2.0F + paramContext.getResources().getDimension(2131427804));
    i = (int)((i - paramContext.getResources().getDimension(2131427785) * 1.0F) / j);
    ab.i("MicroMsg.SeeRoomMemberUI", "[getWrapColNum] :%s", new Object[] { Integer.valueOf(i) });
    elW = i;
    AppMethodBeat.o(104337);
    return i;
  }

  private void d(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(104347);
    if ((paramList != null) && (paramList.size() > 0))
    {
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; i < paramList.size(); i++)
        localLinkedList.add(paramList.get(i));
      paramList = "weixin://findfriend/verifycontact/" + paramString + "/";
      com.tencent.mm.model.m.a(paramString, localLinkedList, getString(2131298067), true, paramList);
    }
    AppMethodBeat.o(104347);
  }

  // ERROR //
  private static Object invokeMethod(Object paramObject, String paramString, Object[] paramArrayOfObject, java.lang.Class[] paramArrayOfClass)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc_w 825
    //   6: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: ifnonnull +14 -> 24
    //   13: ldc_w 825
    //   16: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: aload 4
    //   21: astore_0
    //   22: aload_0
    //   23: areturn
    //   24: aload_0
    //   25: invokevirtual 829	java/lang/Object:getClass	()Ljava/lang/Class;
    //   28: astore 4
    //   30: aload 4
    //   32: ldc_w 398
    //   35: if_acmpeq +142 -> 177
    //   38: aload 4
    //   40: aload_1
    //   41: aload_3
    //   42: invokevirtual 835	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   45: astore 5
    //   47: aload 5
    //   49: astore_1
    //   50: aload_1
    //   51: ifnull +121 -> 172
    //   54: aload_1
    //   55: iconst_1
    //   56: invokevirtual 841	java/lang/reflect/Method:setAccessible	(Z)V
    //   59: aload_1
    //   60: aload_0
    //   61: aload_2
    //   62: invokevirtual 845	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   65: astore_0
    //   66: ldc_w 825
    //   69: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: goto -50 -> 22
    //   75: astore 5
    //   77: ldc_w 259
    //   80: aload 5
    //   82: ldc 234
    //   84: iconst_0
    //   85: anewarray 398	java/lang/Object
    //   88: invokestatic 849	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aload 4
    //   93: invokevirtual 852	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   96: astore 4
    //   98: goto -68 -> 30
    //   101: astore 5
    //   103: ldc_w 259
    //   106: aload 5
    //   108: ldc 234
    //   110: iconst_0
    //   111: anewarray 398	java/lang/Object
    //   114: invokestatic 849	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: goto -26 -> 91
    //   120: astore_0
    //   121: ldc_w 259
    //   124: aload_0
    //   125: ldc 234
    //   127: iconst_0
    //   128: anewarray 398	java/lang/Object
    //   131: invokestatic 849	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   134: aconst_null
    //   135: astore_0
    //   136: goto -70 -> 66
    //   139: astore_0
    //   140: ldc_w 259
    //   143: aload_0
    //   144: ldc 234
    //   146: iconst_0
    //   147: anewarray 398	java/lang/Object
    //   150: invokestatic 849	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: aconst_null
    //   154: astore_0
    //   155: goto -89 -> 66
    //   158: astore_0
    //   159: ldc_w 259
    //   162: aload_0
    //   163: ldc 234
    //   165: iconst_0
    //   166: anewarray 398	java/lang/Object
    //   169: invokestatic 849	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aconst_null
    //   173: astore_0
    //   174: goto -108 -> 66
    //   177: aconst_null
    //   178: astore_1
    //   179: goto -129 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   38	47	75	java/lang/NoSuchMethodException
    //   38	47	101	java/lang/SecurityException
    //   59	66	120	java/lang/IllegalAccessException
    //   59	66	139	java/lang/IllegalArgumentException
    //   59	66	158	java/lang/reflect/InvocationTargetException
  }

  private boolean kh(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(104350);
    if (bo.nullAsNil(r.Yz()).equals(paramString))
      AppMethodBeat.o(104350);
    while (true)
    {
      return bool;
      localObject = n.my(this.ejD);
      if (localObject != null)
        break;
      AppMethodBeat.o(104350);
      bool = false;
    }
    Object localObject = ((List)localObject).iterator();
    bool = false;
    label61: if (((Iterator)localObject).hasNext())
    {
      if (!((String)((Iterator)localObject).next()).equals(paramString))
        break label100;
      bool = true;
    }
    label100: 
    while (true)
    {
      break label61;
      AppMethodBeat.o(104350);
      break;
    }
  }

  private void km(String paramString)
  {
    AppMethodBeat.i(104343);
    if ((paramString == null) || (paramString.equals("")))
      AppMethodBeat.o(104343);
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(paramString);
      paramString = com.tencent.mm.roomsdk.a.b.alY(this.ejD).a(this.ejD, localLinkedList, 0);
      paramString.b(new SeeRoomMemberUI.15(this));
      paramString.c(new SeeRoomMemberUI.16(this));
      getString(2131297061);
      paramString.a(this, getString(2131302524), true, new SeeRoomMemberUI.17(this, paramString));
      AppMethodBeat.o(104343);
    }
  }

  public final int getLayoutId()
  {
    return 2130970583;
  }

  public final void initView()
  {
    AppMethodBeat.i(104338);
    setMMTitle(this.mTitle + "(" + this.ejS + ")");
    setBackBtn(new SeeRoomMemberUI.11(this));
    this.elU = ((MMEditText)findViewById(2131823253));
    this.ely = ((GridView)findViewById(2131827307));
    this.ely.setNumColumns(bz(this));
    this.ely.setColumnWidth(getResources().getDimensionPixelSize(2131427785));
    this.elP = new SeeRoomMemberUI.b(this, this, this.eih, this.ejD, Ko(), this.ejT);
    this.elU.addTextChangedListener(new SeeRoomMemberUI.12(this));
    this.ely.setOnItemClickListener(new SeeRoomMemberUI.13(this));
    this.ely.setOnItemLongClickListener(new SeeRoomMemberUI.14(this));
    this.ely.setAdapter(this.elP);
    AppMethodBeat.o(104338);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(104345);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(104345);
      while (true)
      {
        return;
        if (paramIntent == null)
        {
          AppMethodBeat.o(104345);
        }
        else
        {
          Object localObject = paramIntent.getStringExtra("Select_Contact");
          if (!com.tencent.mm.model.m.mo((String)localObject))
          {
            com.tencent.mm.ui.base.h.b(this, getString(2131302573), getString(2131297061), true);
            AppMethodBeat.o(104345);
          }
          else if (kh((String)localObject))
          {
            com.tencent.mm.ui.base.h.b(this, getString(2131296416), getString(2131297061), true);
            AppMethodBeat.o(104345);
          }
          else if (bo.P(((String)localObject).split(",")) == null)
          {
            AppMethodBeat.o(104345);
          }
          else
          {
            paramIntent = paramIntent.getStringExtra("Select_Contact");
            u localu = ((c)com.tencent.mm.kernel.g.K(c.class)).XV().oa(this.ejD);
            if (localu == null)
              break;
            if (localu.drV() == 2)
            {
              localObject = new e.a(this).asL(getString(2131302488));
              ((e.a)localObject).zQJ = getString(2131297041);
              localObject = ((e.a)localObject).re(true).m(Boolean.TRUE);
              ((e.a)localObject).zQK = getString(2131296868);
              ((e.a)localObject).asN(getString(2131302178)).c(new SeeRoomMemberUI.18(this, paramIntent)).show();
              AppMethodBeat.o(104345);
            }
            else
            {
              b((String)localObject, null, 2131296430);
              AppMethodBeat.o(104345);
              continue;
              if (paramIntent != null)
                break label334;
              AppMethodBeat.o(104345);
            }
          }
        }
      }
      label334: km(paramIntent.getStringExtra("Select_Contact"));
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(104336);
    super.onConfigurationChanged(paramConfiguration);
    this.ely.setNumColumns(bz(this));
    AppMethodBeat.o(104336);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104334);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.h.pYm.a(219L, 2L, 1L, true);
    com.tencent.mm.kernel.g.RO().eJo.a(990, this);
    this.ejD = getIntent().getStringExtra("RoomInfo_Id");
    this.talker = getIntent().getStringExtra("Chat_User");
    this.elR = getIntent().getStringExtra("Chatroom_member_list");
    this.cEH = getIntent().getBooleanExtra("Is_Chatroom", true);
    this.ehL = getIntent().getBooleanExtra("Is_Lbsroom", false);
    this.ejU = getIntent().getBooleanExtra("Is_RoomOwner", false);
    this.ejT = getIntent().getStringExtra("room_owner_name");
    this.mTitle = getIntent().getStringExtra("Add_address_titile");
    ag localag = ((c)com.tencent.mm.kernel.g.K(c.class)).XV();
    if (this.talker == null)
    {
      paramBundle = this.ejD;
      this.eih = localag.oa(paramBundle);
      this.ejS = getIntent().getIntExtra("room_member_count", 0);
      this.ejR = getIntent().getStringExtra("room_name");
      this.Lp = getIntent().getIntExtra("offset", 0);
      this.elV = getIntent().getIntExtra("first_pos", 0);
      initView();
      if (this.elP != null)
      {
        Kn();
        paramBundle = this.ely;
        if (this.elV * elW >= this.elP.getCount())
          break label335;
      }
    }
    label335: for (int i = this.elV * elW; ; i = this.elP.getCount() - 1)
    {
      paramBundle.setSelection(i);
      this.ely.postDelayed(new SeeRoomMemberUI.1(this), 100L);
      AppMethodBeat.o(104334);
      return;
      paramBundle = this.talker;
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104341);
    com.tencent.mm.kernel.g.RO().eJo.b(990, this);
    if ((this.ejZ != null) && (this.ejZ.isShowing()))
      this.ejZ.dismiss();
    super.onDestroy();
    AppMethodBeat.o(104341);
  }

  public void onPause()
  {
    AppMethodBeat.i(104340);
    super.onPause();
    if (this.elS != null)
      this.elS.dJS();
    AppMethodBeat.o(104340);
  }

  public void onResume()
  {
    AppMethodBeat.i(104335);
    super.onResume();
    if (this.elP != null)
      this.elP.ko(this.elU.getText().toString());
    AppMethodBeat.o(104335);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(104344);
    if ((this.ejZ != null) && (this.ejZ.isShowing()))
      this.ejZ.dismiss();
    paramString = com.tencent.mm.h.a.jY(paramString);
    if (paramString != null)
    {
      paramString.a(this, null, null);
      AppMethodBeat.o(104344);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(104344);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class a
  {
    ad ehM;
    int order = 0;
    int type;

    public a(int paramInt)
    {
      this.type = paramInt;
      this.ehM = null;
    }

    public a(ad paramad, int paramInt)
    {
      this.type = 1;
      this.ehM = paramad;
      this.order = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomMemberUI
 * JD-Core Version:    0.6.2
 */