package com.tencent.mm.ui.chatting.gallery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.d;
import com.tencent.mm.at.l;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.b.a.e.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.WxImageView;
import com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.chatting.a.c;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

@SuppressLint({"UseSparseArrays"})
public final class c extends com.tencent.mm.ui.base.u
{
  public static long jMj = -1L;
  public static boolean mgP = false;
  private String egE;
  private ArrayList<bi> mnX;
  public ImageGalleryUI yTI;
  protected c.a yTJ;
  private String yTK;
  boolean yTL;
  public boolean yTM;
  public e yTN;
  public j yTO;
  public i yTP;
  public c.c yTQ;
  boolean yTR;
  protected boolean yTS;
  private com.tencent.mm.g.b.a.e yTT;

  public c(ImageGalleryUI paramImageGalleryUI, long paramLong1, String paramString1, boolean paramBoolean1, long paramLong2, boolean paramBoolean2, String paramString2, Boolean paramBoolean)
  {
    AppMethodBeat.i(31977);
    this.yTL = true;
    this.yTM = false;
    this.egE = null;
    this.yTS = true;
    this.mnX = new ArrayList();
    this.yTT = null;
    String str = "MicroMsg.ImageGalleryAdapter, invalid argument, context = " + paramImageGalleryUI + ", currentMsgId = " + paramLong1 + ", talker = " + paramString1 + ", stack = " + bo.dpG();
    if ((paramLong1 > 0L) && (paramString1 != null) && (paramString1.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(str, bool);
      this.yTI = paramImageGalleryUI;
      mgP = paramBoolean1;
      jMj = paramLong2;
      this.egE = paramString1;
      this.yTJ = new c.a(paramLong1, paramString1, this, paramBoolean);
      this.yTM = paramBoolean2;
      this.yTK = paramString2;
      this.yTN = new e(this);
      this.yTO = new j(this);
      this.yTP = new i(this);
      AppMethodBeat.o(31977);
      return;
    }
  }

  public static boolean a(Context paramContext, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(31997);
    if (parambi == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(31997);
    }
    while (true)
    {
      return paramBoolean;
      s locals = com.tencent.mm.modelvideo.o.all().uf(parambi.field_imgPath);
      boolean bool = false;
      if (locals != null)
      {
        int i = 0;
        if (com.tencent.mm.model.t.kH(locals.getUser()))
          i = com.tencent.mm.model.n.mA(locals.getUser());
        bool = locals.alz();
        com.tencent.mm.plugin.report.service.h.pYm.a(106L, 216L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.e(12084, new Object[] { Integer.valueOf(locals.frO), Integer.valueOf(locals.fXd * 1000), Integer.valueOf(0), Integer.valueOf(2), locals.getUser(), Integer.valueOf(i), s.ue(locals.alw()), Long.valueOf(locals.createTime) });
      }
      if (!bool)
      {
        ab.w("MicroMsg.ImageGalleryAdapter", "do export video but video had not download finish.");
        if (paramBoolean)
          Toast.makeText(paramContext, paramContext.getString(2131304256), 1).show();
        paramBoolean = false;
        AppMethodBeat.o(31997);
      }
      else
      {
        com.tencent.mm.modelvideo.o.all();
        parambi = com.tencent.mm.modelvideo.u.uu(com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath));
        if (bo.isNullOrNil(parambi))
        {
          if (paramBoolean)
            Toast.makeText(paramContext, paramContext.getString(2131304256), 1).show();
          paramBoolean = false;
          AppMethodBeat.o(31997);
        }
        else
        {
          if (paramBoolean)
            Toast.makeText(paramContext, paramContext.getString(2131304257, new Object[] { parambi }), 1).show();
          com.tencent.mm.pluginsdk.ui.tools.n.a(parambi, paramContext);
          paramBoolean = true;
          AppMethodBeat.o(31997);
        }
      }
    }
  }

  public static boolean b(Context paramContext, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(31998);
    Object localObject;
    if (br(parambi))
    {
      localObject = e(parambi);
      if ((localObject != null) && (((String)localObject).length() != 0))
        break label269;
      ab.e("MicroMsg.ImageGalleryAdapter", "doRestransmitMsg fail, bigImgPath is null, msgLocalId = " + parambi.field_msgId);
      if (paramBoolean)
        Toast.makeText(paramContext, paramContext.getString(2131302707), 1).show();
      AppMethodBeat.o(31998);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      if ((parambi == null) || (parambi.field_msgId == 0L))
      {
        ab.e("MicroMsg.ImageGalleryAdapter", "msg is null");
        if (paramBoolean)
          Toast.makeText(paramContext, paramContext.getString(2131302707), 1).show();
        AppMethodBeat.o(31998);
        paramBoolean = false;
      }
      else
      {
        localObject = e.d(parambi);
        if ((localObject == null) || (((com.tencent.mm.at.e)localObject).fDy == 0L))
        {
          StringBuilder localStringBuilder = new StringBuilder("doRestransmitMsg fail, msgLocalId = ");
          if (parambi == null)
          {
            parambi = "null";
            label172: localStringBuilder = localStringBuilder.append(parambi).append(", imgLocalId = ");
            if (localObject != null)
              break label249;
          }
          label249: for (parambi = "null"; ; parambi = Long.valueOf(((com.tencent.mm.at.e)localObject).fDy))
          {
            ab.e("MicroMsg.ImageGalleryAdapter", parambi);
            if (paramBoolean)
              Toast.makeText(paramContext, paramContext.getString(2131302707), 1).show();
            AppMethodBeat.o(31998);
            paramBoolean = false;
            break;
            parambi = Long.valueOf(parambi.field_msgId);
            break label172;
          }
        }
        localObject = e.a(parambi, (com.tencent.mm.at.e)localObject);
        break;
        label269: if (!q.a((String)localObject, paramContext, paramBoolean, 2131298807))
        {
          if (paramBoolean)
            Toast.makeText(paramContext, paramContext.getString(2131302707), 1).show();
          AppMethodBeat.o(31998);
          paramBoolean = false;
        }
        else
        {
          AppMethodBeat.o(31998);
          paramBoolean = true;
        }
      }
    }
  }

  public static boolean b(bi parambi, com.tencent.mm.at.e parame)
  {
    AppMethodBeat.i(31988);
    boolean bool;
    if ((parambi == null) || (parame == null))
    {
      bool = false;
      AppMethodBeat.o(31988);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.at.o.ahm().a(parame.fDy, parambi.field_msgId, 1);
      AppMethodBeat.o(31988);
    }
  }

  public static boolean bp(bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(31984);
    if (parambi == null)
      AppMethodBeat.o(31984);
    while (true)
    {
      return bool;
      if (parambi.getType() == 62)
      {
        bool = true;
        AppMethodBeat.o(31984);
      }
      else
      {
        AppMethodBeat.o(31984);
      }
    }
  }

  public static boolean bq(bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(31985);
    if (parambi == null)
      AppMethodBeat.o(31985);
    while (true)
    {
      return bool;
      if (parambi.getType() == 49)
      {
        bool = true;
        AppMethodBeat.o(31985);
      }
      else
      {
        AppMethodBeat.o(31985);
      }
    }
  }

  public static boolean br(bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(31986);
    if (parambi == null)
      AppMethodBeat.o(31986);
    while (true)
    {
      return bool;
      if (parambi.getType() == 268435505)
      {
        bool = true;
        AppMethodBeat.o(31986);
      }
      else
      {
        AppMethodBeat.o(31986);
      }
    }
  }

  public static b bt(bi parambi)
  {
    AppMethodBeat.i(31991);
    b localb = b.yUm;
    if (parambi == null)
      localb = b.yUm;
    if (br(parambi))
    {
      parambi = b.yUq;
      AppMethodBeat.o(31991);
    }
    while (true)
    {
      return parambi;
      if (c(parambi))
      {
        parambi = b.yUn;
        AppMethodBeat.o(31991);
      }
      else if (bu(parambi))
      {
        parambi = b.yUp;
        AppMethodBeat.o(31991);
      }
      else if (f(parambi))
      {
        parambi = b.yUo;
        AppMethodBeat.o(31991);
      }
      else if (bp(parambi))
      {
        parambi = b.yUo;
        AppMethodBeat.o(31991);
      }
      else
      {
        parambi = b.yUm;
        AppMethodBeat.o(31991);
      }
    }
  }

  private static boolean bu(bi parambi)
  {
    AppMethodBeat.i(31992);
    boolean bool;
    if (parambi != null)
    {
      parambi = com.tencent.mm.modelvideo.u.ut(parambi.field_imgPath);
      if ((parambi != null) && (parambi.fXm != null) && ((!bo.isNullOrNil(parambi.fXm.fiG)) || (parambi.fXm.wid > 0) || (!bo.isNullOrNil(parambi.fXm.fiJ)) || (!bo.isNullOrNil(parambi.fXm.fiK)) || (!bo.isNullOrNil(parambi.fXm.fiI)) || (!bo.isNullOrNil(parambi.fXm.fiL)) || (!bo.isNullOrNil(parambi.fXm.fiM)) || (!bo.isNullOrNil(parambi.fXm.fiN))))
      {
        bool = true;
        AppMethodBeat.o(31992);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31992);
    }
  }

  public static int c(bi parambi, com.tencent.mm.at.e parame)
  {
    int i = 1;
    AppMethodBeat.i(32003);
    if (parambi.field_isSend == 1)
      if (parame.agQ())
      {
        parambi = com.tencent.mm.at.f.a(parame);
        if ((parambi != null) && (parambi.fDy > 0L) && (parambi.agP()) && (com.tencent.mm.vfs.e.ct(com.tencent.mm.at.o.ahl().q(parambi.fDz, "", ""))))
          AppMethodBeat.o(32003);
      }
    while (true)
    {
      return i;
      AppMethodBeat.o(32003);
      i = 0;
      continue;
      if (parame.agP())
      {
        if (parame.agQ())
        {
          parambi = com.tencent.mm.at.f.a(parame);
          if ((parambi != null) && (parambi.fDy > 0L) && (parambi.agP()) && (com.tencent.mm.vfs.e.ct(com.tencent.mm.at.o.ahl().q(parambi.fDz, "", ""))))
            AppMethodBeat.o(32003);
        }
        else
        {
          AppMethodBeat.o(32003);
          i = 0;
        }
      }
      else
      {
        AppMethodBeat.o(32003);
        i = 0;
      }
    }
  }

  public static boolean c(bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(31982);
    if (parambi == null)
      AppMethodBeat.o(31982);
    while (true)
    {
      return bool;
      if ((parambi.getType() == 3) || (parambi.getType() == 39) || (parambi.getType() == 13))
      {
        bool = true;
        AppMethodBeat.o(31982);
      }
      else
      {
        AppMethodBeat.o(31982);
      }
    }
  }

  public static String e(bi parambi)
  {
    Object localObject = null;
    com.tencent.mm.pluginsdk.model.app.b localb = null;
    AppMethodBeat.i(32001);
    j.b localb1 = j.b.me(parambi.field_content);
    if (localb1 == null)
    {
      AppMethodBeat.o(32001);
      parambi = localb;
    }
    while (true)
    {
      return parambi;
      parambi = localObject;
      if (localb1.csD != null)
      {
        parambi = localObject;
        if (localb1.csD.length() > 0)
        {
          localb = am.aUq().aiE(localb1.csD);
          parambi = localObject;
          if (localb != null)
            parambi = localb.field_fileFullPath;
        }
      }
      AppMethodBeat.o(32001);
    }
  }

  public static boolean f(Context paramContext, List<bi> paramList)
  {
    boolean bool1 = true;
    AppMethodBeat.i(31996);
    boolean bool2;
    if ((paramContext == null) || (paramList == null) || (paramList.size() <= 0))
    {
      AppMethodBeat.o(31996);
      bool2 = false;
      return bool2;
    }
    label47: int i;
    label58: boolean bool3;
    if (paramList.size() <= 1)
    {
      bool2 = true;
      Iterator localIterator = paramList.iterator();
      i = 0;
      if (!localIterator.hasNext())
        break label126;
      paramList = (bi)localIterator.next();
      if (!f(paramList))
        break label115;
      bool3 = a(paramContext, paramList, bool2);
      label94: if ((i != 0) || (!bool3))
        break label198;
      i = 1;
    }
    label198: 
    while (true)
    {
      break label58;
      bool2 = false;
      break label47;
      label115: bool3 = b(paramContext, paramList, bool2);
      break label94;
      label126: if ((i == 0) && (!bool2))
        Toast.makeText(paramContext, paramContext.getString(2131302708), 1).show();
      while (true)
      {
        AppMethodBeat.o(31996);
        bool2 = bool1;
        break;
        if ((i != 0) && (!bool2))
          Toast.makeText(paramContext, paramContext.getString(2131299407, new Object[] { com.tencent.mm.compatible.util.e.euR }), 1).show();
      }
    }
  }

  public static boolean f(bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(31983);
    if (parambi == null)
      AppMethodBeat.o(31983);
    while (true)
    {
      return bool;
      if (bu(parambi))
      {
        AppMethodBeat.o(31983);
      }
      else if ((parambi.getType() == 43) || (parambi.getType() == 44) || (parambi.getType() == 62))
      {
        bool = true;
        AppMethodBeat.o(31983);
      }
      else
      {
        AppMethodBeat.o(31983);
      }
    }
  }

  private void j(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(31994);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ImageGalleryAdapter", "doRestransmitImg fail, imgPath is null");
      AppMethodBeat.o(31994);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.yTK))
        break;
      ab.i("MicroMsg.ImageGalleryAdapter", "directly send user is empty, select one");
      Intent localIntent = new Intent(this.yTI, MsgRetransmitUI.class);
      localIntent.putExtra("Retr_File_Name", paramString);
      localIntent.putExtra("Retr_Msg_Id", paramLong);
      localIntent.putExtra("Retr_Msg_Type", 0);
      localIntent.putExtra("Retr_Compress_Type", paramInt);
      this.yTI.startActivity(localIntent);
      AppMethodBeat.o(31994);
    }
    ab.i("MicroMsg.ImageGalleryAdapter", "directly send user %s", new Object[] { this.yTK });
    if (!bo.isNullOrNil(paramString))
    {
      paramString = new l(r.Yz(), this.yTK, paramString, paramInt);
      aw.Rg().a(paramString, 0);
      bv.aaq().c(bv.fnv, null);
    }
    if (this.yTL)
    {
      paramString = new Intent(this.yTI, ChattingUI.class);
      paramString.addFlags(67108864);
      paramString.putExtra("Chat_User", this.yTK);
      this.yTI.startActivity(paramString);
    }
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(3), Integer.valueOf(4), this.yTK });
      AppMethodBeat.o(31994);
      break;
      com.tencent.mm.ui.base.h.bQ(this.yTI, this.yTI.getString(2131297039));
    }
  }

  public final void OL(int paramInt)
  {
    AppMethodBeat.i(31989);
    bi localbi = Ou(paramInt);
    Object localObject = bt(localbi);
    switch (c.2.yTX[localObject.ordinal()])
    {
    default:
      bw(localbi);
      AppMethodBeat.o(31989);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      bv(localbi);
      AppMethodBeat.o(31989);
      continue;
      String str = e(localbi);
      localObject = new Intent(this.yTI, MsgRetransmitUI.class);
      ((Intent)localObject).putExtra("Retr_File_Name", str);
      ((Intent)localObject).putExtra("Retr_Msg_Id", localbi.field_msgId);
      ((Intent)localObject).putExtra("Retr_Msg_Type", 16);
      ((Intent)localObject).putExtra("Retr_Msg_content", localbi.field_content);
      ((Intent)localObject).putExtra("Retr_Compress_Type", 0);
      this.yTI.startActivity((Intent)localObject);
      AppMethodBeat.o(31989);
    }
  }

  public final void OM(int paramInt)
  {
    AppMethodBeat.i(31990);
    bi localbi = Ou(paramInt);
    Object localObject = bt(localbi);
    switch (c.2.yTX[localObject.ordinal()])
    {
    case 3:
    default:
    case 1:
    case 2:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(31990);
      return;
      localObject = new Intent(this.yTI, ChattingSendDataToDeviceUI.class);
      ((Intent)localObject).putExtra("Retr_Msg_Id", localbi.field_msgId);
      this.yTI.startActivity((Intent)localObject);
    }
  }

  public final void ON(int paramInt)
  {
    AppMethodBeat.i(31999);
    bi localbi = Ou(paramInt);
    cl localcl = new cl();
    com.tencent.mm.pluginsdk.model.e.d(localcl, localbi);
    localcl.cvA.activity = this.yTI;
    localcl.cvA.cvH = 44;
    com.tencent.mm.sdk.b.a.xxA.m(localcl);
    if (localcl.cvB.ret == 0)
    {
      if (localbi.bwt())
        com.tencent.mm.ui.chatting.a.a(a.c.yFG, a.d.yFM, localbi, 0);
      com.tencent.mm.modelstat.b.fRa.D(localbi);
    }
    AppMethodBeat.o(31999);
  }

  public final View OO(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(32007);
    View localView1 = super.Fp(paramInt);
    Object localObject2;
    if (localView1 == null)
    {
      ab.e("MicroMsg.ImageGalleryAdapter", "position : %s getVideoViewByPosition is null", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(32007);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      View localView2 = localView1.findViewById(2131824988);
      localObject2 = localView2;
      if (localView2 == null)
        localObject2 = localView1.findViewById(2131823992);
      if ((localObject2 == null) || (((View)localObject2).getVisibility() == 8))
      {
        AppMethodBeat.o(32007);
        localObject2 = localObject1;
      }
      else
      {
        AppMethodBeat.o(32007);
      }
    }
  }

  public final void OP(int paramInt)
  {
    AppMethodBeat.i(32008);
    this.yTO.i(Ou(paramInt), paramInt);
    AppMethodBeat.o(32008);
  }

  public final void OQ(int paramInt)
  {
    AppMethodBeat.i(32009);
    this.yTO.j(Ou(paramInt), paramInt);
    AppMethodBeat.o(32009);
  }

  public final void OR(int paramInt)
  {
    AppMethodBeat.i(32012);
    this.yTO.OK(paramInt);
    AppMethodBeat.o(32012);
  }

  public final void OS(int paramInt)
  {
    AppMethodBeat.i(32015);
    bi localbi = Ou(paramInt);
    if ((localbi == null) || (!c(localbi)))
      AppMethodBeat.o(32015);
    while (true)
    {
      return;
      this.yTN.bB(localbi);
      AppMethodBeat.o(32015);
    }
  }

  public final void OT(int paramInt)
  {
    AppMethodBeat.i(32016);
    this.yTP.OZ(paramInt);
    AppMethodBeat.o(32016);
  }

  public final bi Ou(int paramInt)
  {
    AppMethodBeat.i(31979);
    bi localbi = this.yTJ.OV(paramInt);
    AppMethodBeat.o(31979);
    return localbi;
  }

  public final void a(bi parambi, com.tencent.mm.at.e parame, int paramInt, e.a parama)
  {
    AppMethodBeat.i(32019);
    if (parambi == null)
      AppMethodBeat.o(32019);
    while (true)
    {
      return;
      if (this.yTT == null)
      {
        AppMethodBeat.o(32019);
      }
      else
      {
        this.yTT.Fo().cUW = parama;
        long l1 = parambi.field_msgSvrId;
        if (paramInt == 1);
        for (int i = 1; ; i = 0)
        {
          if ((this.yTT.cUO == l1) || (this.yTT.cUQ == i))
            break label149;
          ab.w("MicroMsg.ImageGalleryAdapter", "waiting img[%d] download finish but other img[%d] download finish callback don't report", new Object[] { Long.valueOf(this.yTT.cUO), Long.valueOf(l1) });
          parambi = this.yTT;
          parambi.cUW = e.a.cUY;
          parambi.ajK();
          AppMethodBeat.o(32019);
          break;
        }
        label149: long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        long l5 = bo.yz();
        long l6 = l4;
        long l7 = l3;
        l1 = l2;
        if (parama == e.a.cUX)
        {
          parambi = e.a(parambi, parame);
          l6 = l4;
          l7 = l3;
          l1 = l2;
          if (!bo.isNullOrNil(parambi))
          {
            l1 = com.tencent.mm.vfs.e.asZ(parambi);
            parambi = e.arv(parambi);
            l6 = parambi.outWidth;
            l7 = parambi.outHeight;
          }
        }
        parambi = this.yTT;
        parambi.cUR = l1;
        parambi.cUT = l7;
        parambi.cUS = l6;
        this.yTT.ajK();
        ab.i("MicroMsg.ImageGalleryAdapter", "stopWaitingImg [%d] [%s]", new Object[] { Long.valueOf(bo.az(l5)), this.yTT.Fj() });
        this.yTT = null;
        AppMethodBeat.o(32019);
      }
    }
  }

  public final void aF(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(32004);
    this.yTN.aF(paramInt, paramBoolean);
    AppMethodBeat.o(32004);
  }

  public final boolean bs(bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(31987);
    if (parambi == null)
      AppMethodBeat.o(31987);
    while (true)
    {
      return bool;
      com.tencent.mm.at.e locale = f(parambi, false);
      if (locale != null)
      {
        if ((parambi == null) || (locale == null))
        {
          AppMethodBeat.o(31987);
        }
        else if ((com.tencent.mm.at.o.ahm().a(locale.fDy, parambi.field_msgId, 0)) || (b(parambi, locale)))
        {
          AppMethodBeat.o(31987);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(31987);
        }
      }
      else
      {
        parambi = j.bG(parambi);
        if (parambi != null)
        {
          if (parambi == null)
          {
            AppMethodBeat.o(31987);
          }
          else
          {
            int i = parambi.status;
            int j = com.tencent.mm.modelvideo.u.g(parambi);
            if (((i == 112) || (i == 122)) && (j < 100));
            for (bool = true; ; bool = false)
            {
              ab.i("MicroMsg.ImageGalleryAdapter", "it is video downloading %b, status %d, download progress %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
              AppMethodBeat.o(31987);
              break;
            }
          }
        }
        else
          AppMethodBeat.o(31987);
      }
    }
  }

  public final void bv(bi parambi)
  {
    AppMethodBeat.i(31993);
    aw.ZK();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.t.hO(this.yTI);
      AppMethodBeat.o(31993);
    }
    s locals;
    while (true)
    {
      return;
      locals = com.tencent.mm.modelvideo.u.ut(parambi.field_imgPath);
      if (locals != null)
        break;
      ab.e("MicroMsg.ImageGalleryAdapter", "videoInfo should not be null");
      AppMethodBeat.o(31993);
    }
    Intent localIntent = new Intent(this.yTI, MsgRetransmitUI.class);
    localIntent.putExtra("Retr_length", locals.fXd);
    localIntent.putExtra("Retr_File_Name", parambi.field_imgPath);
    localIntent.putExtra("Retr_video_isexport", locals.fXh);
    if (bp(parambi));
    for (int i = 11; ; i = 1)
    {
      localIntent.putExtra("Retr_Msg_Type", i);
      localIntent.putExtra("Retr_Msg_Id", parambi.field_msgId);
      localIntent.putExtra("Retr_From", "gallery");
      this.yTI.startActivity(localIntent);
      AppMethodBeat.o(31993);
      break;
    }
  }

  public final void bw(bi parambi)
  {
    AppMethodBeat.i(31995);
    com.tencent.mm.at.e locale = e.d(parambi);
    Object localObject;
    if ((parambi == null) || (parambi.field_msgId == 0L) || (locale == null) || (locale.fDy == 0L))
    {
      localObject = new StringBuilder("doRestransmitMsg fail, msgLocalId = ");
      if (parambi == null)
      {
        parambi = "null";
        localObject = ((StringBuilder)localObject).append(parambi).append(", imgLocalId = ");
        if (locale != null)
          break label107;
        parambi = "null";
        label76: ab.e("MicroMsg.ImageGalleryAdapter", parambi);
        AppMethodBeat.o(31995);
      }
    }
    while (true)
    {
      return;
      parambi = Long.valueOf(parambi.field_msgId);
      break;
      label107: parambi = Long.valueOf(locale.fDy);
      break label76;
      localObject = e.a(parambi, locale);
      if (bo.isNullOrNil((String)localObject))
      {
        ab.e("MicroMsg.ImageGalleryAdapter", "doRestransmitMsg fail, bigImgPath is null, msgLocalId = " + parambi.field_msgId + ", imgLocalId = " + locale.fDy);
        AppMethodBeat.o(31995);
      }
      else
      {
        j((String)localObject, c(parambi, locale), parambi.field_msgId);
        AppMethodBeat.o(31995);
      }
    }
  }

  public final View d(int paramInt, View paramView)
  {
    AppMethodBeat.i(32000);
    bi localbi = Ou(paramInt);
    View localView;
    k localk;
    if (paramView == null)
    {
      localView = View.inflate(this.yTI, 2130969852, null);
      localk = new k(this, localView);
      localView.setTag(localk);
      paramView = bt(localbi);
      localk.mPosition = paramInt;
      localk.yXe = paramView;
      k.am(localk.mRR, 0);
      switch (k.5.yTX[paramView.ordinal()])
      {
      default:
        label112: k.am(localk.yXB, 8);
        k.am(localk.yXC, 8);
        k.am(localk.yXD, 8);
        k.am(localk.yXs, 8);
        k.am(localk.yXy, 8);
        k.am(localk.yXx, 8);
        ab.d("MicroMsg.ImageGalleryAdapter", "position:%d, type: %s", new Object[] { Integer.valueOf(paramInt), paramView });
        switch (c.2.yTX[paramView.ordinal()])
        {
        default:
        case 4:
        case 3:
        case 1:
        case 2:
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      this.yTS = false;
      AppMethodBeat.o(32000);
      return localView;
      localk = (k)paramView.getTag();
      localView = paramView;
      break;
      k.am(localk.yXm, 8);
      k.am(localk.yXg, 8);
      break label112;
      localk.dGH();
      k.am(localk.yXm, 0);
      k.am(localk.yXg, 8);
      if (localk.yXg == null)
        break label112;
      k.am(localk.yXi, 8);
      break label112;
      localk.dGG();
      k.am(localk.yXm, 8);
      k.am(localk.yXg, 0);
      break label112;
      k.am(localk.mRR, 8);
      k.am(localk.yXm, 8);
      k.am(localk.yXg, 8);
      break label112;
      this.yTN.a(localk, localbi, paramInt);
      if (paramInt == 100000)
      {
        ((com.tencent.mm.plugin.comm.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.comm.a.b.class)).T(localbi);
        continue;
        k.am(localk.yXB, 0);
        k.am(localk.yXs, 8);
        k.am(localk.yXx, 8);
        k.am(localk.yXy, 8);
        k.am(localk.yXq, 8);
        String str = e(localbi);
        try
        {
          paramView = x.vw(str);
          localObject = paramView;
          if (paramView == null)
          {
            localObject = x.vv(com.tencent.mm.at.o.ahl().I(localbi.field_imgPath, true));
            k.am(localk.yXx, 0);
            new ak().post(new c.1(this, localbi, localk, str));
          }
          if (localObject == null)
          {
            ab.w("MicroMsg.ImageGalleryAdapter", "get image fail");
            localk.yXB.setVisibility(8);
            localk.dGF().yXy.setVisibility(0);
            localk.dGF().yXA.setImageResource(2131231499);
            localk.dGF().yXz.setText(this.yTI.getString(2131300610));
            if (paramInt != 100000)
              continue;
            ((com.tencent.mm.plugin.comm.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.comm.a.b.class)).T(localbi);
          }
        }
        catch (OutOfMemoryError paramView)
        {
          while (true)
          {
            Object localObject;
            ab.w("MicroMsg.ImageGalleryAdapter", "[tomys] Oops, app img [%s] is too large, use resample version.", new Object[] { str });
            Runtime.getRuntime().gc();
            Runtime.getRuntime().runFinalization();
            paramView = x.vv(str);
            continue;
            localk.yXB.setEnableHorLongBmpMode(false);
            com.tencent.mm.sdk.platformtools.n.w(localk.yXB, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
            localk.yXB.bW(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
            localk.yXB.setImageBitmap((Bitmap)localObject);
            localk.yXB.invalidate();
          }
        }
        this.yTO.a(localk, localbi, paramInt);
        continue;
        this.yTP.a(localk, localbi, paramInt);
      }
    }
  }

  public final void dFM()
  {
    AppMethodBeat.i(31980);
    this.yTJ.dFM();
    AppMethodBeat.o(31980);
  }

  public final boolean dFN()
  {
    return this.yTJ.prepared;
  }

  public final bi dFO()
  {
    AppMethodBeat.i(32010);
    bi localbi = Ou(this.yTI.getCurrentItem());
    AppMethodBeat.o(32010);
    return localbi;
  }

  public final k dFP()
  {
    AppMethodBeat.i(32011);
    Object localObject1 = this.yTN.OJ(this.yTI.getCurrentItem());
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = this.yTO.OJ(this.yTI.getCurrentItem());
    localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = this.yTP.OJ(this.yTI.getCurrentItem());
    AppMethodBeat.o(32011);
    return localObject1;
  }

  public final void dFQ()
  {
    AppMethodBeat.i(32014);
    this.yTO.onResume();
    AppMethodBeat.o(32014);
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(32017);
    paramViewGroup.removeView((View)paramObject);
    super.destroyItem(paramViewGroup, paramInt, paramObject);
    AppMethodBeat.o(32017);
  }

  public final void detach()
  {
    AppMethodBeat.i(32002);
    this.yTN.detach();
    this.yTO.detach();
    this.yTP.detach();
    if (this.yTT != null)
    {
      com.tencent.mm.g.b.a.e locale = this.yTT.Fo();
      locale.cUW = e.a.cUY;
      locale.ajK();
    }
    super.detach();
    AppMethodBeat.o(32002);
  }

  public final com.tencent.mm.at.e f(bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(31981);
    parambi = this.yTN.f(parambi, paramBoolean);
    AppMethodBeat.o(31981);
    return parambi;
  }

  public final int firstItemPosForDetermine()
  {
    return 100000 - this.yTJ.yTZ;
  }

  public final void g(bi parambi, boolean paramBoolean)
  {
    int i = 2;
    AppMethodBeat.i(32018);
    if (parambi == null)
      AppMethodBeat.o(32018);
    while (true)
    {
      return;
      Object localObject = dFO();
      if ((localObject == null) || (((cy)localObject).field_msgId != parambi.field_msgId))
      {
        ab.d("MicroMsg.ImageGalleryAdapter", "it is not curr msg[%d] handle nothing. arg msg[%d]", new Object[] { Long.valueOf(((cy)localObject).field_msgId), Long.valueOf(parambi.field_msgId) });
        AppMethodBeat.o(32018);
      }
      else
      {
        long l = parambi.field_msgSvrId;
        if ((this.yTT != null) && ((this.yTT.cUO != l) || (this.yTT.cUQ != paramBoolean)))
        {
          localObject = this.yTT.Fo();
          ((com.tencent.mm.g.b.a.e)localObject).cUW = e.a.cUY;
          ((com.tencent.mm.g.b.a.e)localObject).ajK();
        }
        this.yTT = new com.tencent.mm.g.b.a.e();
        this.yTT.Fn();
        localObject = this.yTT;
        ((com.tencent.mm.g.b.a.e)localObject).cUO = l;
        ((com.tencent.mm.g.b.a.e)localObject).cUP = parambi.field_createTime;
        ((com.tencent.mm.g.b.a.e)localObject).cUQ = paramBoolean;
        if (com.tencent.mm.model.t.kH(this.egE))
          i = com.tencent.mm.model.n.mA(this.egE);
        this.yTT.er(this.egE).cUN = i;
        AppMethodBeat.o(32018);
      }
    }
  }

  public final int getCount()
  {
    c.a locala = this.yTJ;
    return locala.enb - locala.yTZ + 100000 + 1;
  }

  public final int getRealCount()
  {
    return this.yTJ.enb;
  }

  public final int lastItemPosForDetermine()
  {
    return 100000 - this.yTJ.yTZ + this.yTJ.enb - 1;
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(32013);
    super.notifyDataSetChanged();
    AppMethodBeat.o(32013);
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(31978);
    if ((this.yTN != null) && (c(Ou(paramInt))))
      this.yTN.yVa.onPageSelected(paramInt);
    AppMethodBeat.o(31978);
  }

  public final MultiTouchImageView wx(int paramInt)
  {
    AppMethodBeat.i(32005);
    Object localObject = super.Fp(paramInt);
    if (localObject == null)
    {
      ab.e("MicroMsg.ImageGalleryAdapter", "position : %s getMultiTouchImageViewByPosition is null", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(32005);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = ((View)localObject).findViewById(2131820629);
      if ((localObject == null) || (((View)localObject).getVisibility() == 8))
      {
        AppMethodBeat.o(32005);
        localObject = null;
      }
      else
      {
        localObject = (MultiTouchImageView)localObject;
        AppMethodBeat.o(32005);
      }
    }
  }

  public final WxImageView wy(int paramInt)
  {
    AppMethodBeat.i(32006);
    Object localObject = super.Fp(paramInt);
    if (localObject == null)
    {
      AppMethodBeat.o(32006);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = ((View)localObject).findViewById(2131824980);
      if ((localObject == null) || (((View)localObject).getVisibility() == 8))
      {
        AppMethodBeat.o(32006);
        localObject = null;
      }
      else
      {
        localObject = (WxImageView)localObject;
        AppMethodBeat.o(32006);
      }
    }
  }

  public static enum b
  {
    static
    {
      AppMethodBeat.i(31976);
      yUm = new b("unkown", 0);
      yUn = new b("image", 1);
      yUo = new b("video", 2);
      yUp = new b("sight", 3);
      yUq = new b("appimage", 4);
      yUr = new b[] { yUm, yUn, yUo, yUp, yUq };
      AppMethodBeat.o(31976);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.c
 * JD-Core Version:    0.6.2
 */