package com.tencent.mm.plugin.multitalk.ui.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.multitalk.model.j;
import com.tencent.mm.plugin.multitalk.model.k;
import com.tencent.mm.plugin.multitalk.model.k.a;
import com.tencent.mm.plugin.multitalk.model.k.b;
import com.tencent.mm.plugin.multitalk.model.p;
import com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.ui.MMCheckBox;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.q;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.wecall.talkroom.model.TalkRoom;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  implements View.OnClickListener, d.a, com.tencent.mm.plugin.voip.video.g
{
  public TextView enf;
  com.tencent.mm.ui.widget.a.c gLj;
  public FrameLayout oII;
  public FrameLayout oIJ;
  private RelativeLayout oIK;
  public View oIL;
  private View oIM;
  private View oIN;
  public View oIO;
  public MMCheckBox oIP;
  public MMCheckBox oIQ;
  public MMCheckBox oIR;
  private int oIS;
  private int oIT;
  public ArrayList<RelativeLayout> oIU;
  private RelativeLayout oIV;
  private com.tencent.mm.plugin.voip.video.a oIW;
  private k oIX;
  private ObservableTextureView oIY;
  public String oIZ;
  private MultiTalkMainUI oIm;
  private ImageButton oIs;
  private int oJa;
  public long oJb;
  f.c oJc;

  public f(MultiTalkMainUI paramMultiTalkMainUI)
  {
    AppMethodBeat.i(54203);
    this.oJc = new f.c(this, (byte)0);
    this.gLj = null;
    this.oIU = new ArrayList(9);
    this.oIm = paramMultiTalkMainUI;
    this.oIK = ((RelativeLayout)paramMultiTalkMainUI.findViewById(2131826223));
    if (ae.hD(paramMultiTalkMainUI.mController.ylL));
    for (int i = ae.hC(paramMultiTalkMainUI.mController.ylL) + 0; ; i = 0)
    {
      this.oIK.setPadding(0, i, 0, 0);
      this.enf = ((TextView)paramMultiTalkMainUI.findViewById(2131820988));
      this.oIL = paramMultiTalkMainUI.findViewById(2131826222);
      this.oIs = ((ImageButton)paramMultiTalkMainUI.findViewById(2131826232));
      this.oII = ((FrameLayout)paramMultiTalkMainUI.findViewById(2131826224));
      this.oIJ = ((FrameLayout)paramMultiTalkMainUI.findViewById(2131826225));
      this.oIM = paramMultiTalkMainUI.findViewById(2131826226);
      this.oIN = paramMultiTalkMainUI.findViewById(2131826227);
      this.oIP = ((MMCheckBox)paramMultiTalkMainUI.findViewById(2131826230));
      this.oIQ = ((MMCheckBox)paramMultiTalkMainUI.findViewById(2131826229));
      this.oIR = ((MMCheckBox)paramMultiTalkMainUI.findViewById(2131826231));
      this.oIO = paramMultiTalkMainUI.findViewById(2131826233);
      this.oIQ.setChecked(p.bSf().eif);
      this.oIR.setChecked(p.bSf().oGb);
      this.oIP.setChecked(p.bSf().bRF());
      this.oIS = com.tencent.mm.bz.a.gd(paramMultiTalkMainUI.mController.ylL);
      this.oIT = b.eC(paramMultiTalkMainUI.mController.ylL);
      ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "talkingAvatarContainerHeight %d", new Object[] { Integer.valueOf(this.oIT) });
      this.oIs.setOnClickListener(this);
      this.oIM.setOnClickListener(this);
      this.oIP.setOnClickListener(this);
      this.oIQ.setOnClickListener(this);
      this.oIR.setOnClickListener(this);
      this.oIN.setOnClickListener(this);
      this.oIO.setOnClickListener(this);
      o.acd().a(this);
      Object localObject;
      for (i = 8; i >= 0; i--)
      {
        localObject = this.oII;
        RelativeLayout localRelativeLayout = (RelativeLayout)LayoutInflater.from(paramMultiTalkMainUI).inflate(2130970022, (ViewGroup)localObject, false);
        localObject = new f.a();
        ((f.a)localObject).oJe = ((MultiTalkVideoView)localRelativeLayout.findViewById(2131825730));
        ((f.a)localObject).oJe.setIndex(i);
        ((f.a)localObject).oJe.setOnClickListener(this);
        ((f.a)localObject).iVh = localRelativeLayout.findViewById(2131825731);
        ((f.a)localObject).oJf = ((ImageView)localRelativeLayout.findViewById(2131825734));
        ((f.a)localObject).oJg = ((ImageView)localRelativeLayout.findViewById(2131825735));
        ((f.a)localObject).oJh = ((TextView)localRelativeLayout.findViewById(2131825733));
        ((f.a)localObject).ohf = ((ImageView)localRelativeLayout.findViewById(2131825732));
        localRelativeLayout.setTag(localObject);
        localRelativeLayout.setVisibility(8);
        this.oIU.add(localRelativeLayout);
        this.oII.addView(localRelativeLayout);
      }
      if (this.oIJ != null)
      {
        localObject = this.oIJ;
        paramMultiTalkMainUI = (RelativeLayout)LayoutInflater.from(paramMultiTalkMainUI).inflate(2130970022, (ViewGroup)localObject, false);
        localObject = new f.a();
        ((f.a)localObject).oJe = ((MultiTalkVideoView)paramMultiTalkMainUI.findViewById(2131825730));
        ((f.a)localObject).oJe.setIndex(0);
        ((f.a)localObject).oJe.setOnClickListener(this);
        ((f.a)localObject).iVh = paramMultiTalkMainUI.findViewById(2131825731);
        ((f.a)localObject).oJf = ((ImageView)paramMultiTalkMainUI.findViewById(2131825734));
        ((f.a)localObject).oJg = ((ImageView)paramMultiTalkMainUI.findViewById(2131825735));
        ((f.a)localObject).oJh = ((TextView)paramMultiTalkMainUI.findViewById(2131825733));
        ((f.a)localObject).ohf = ((ImageView)paramMultiTalkMainUI.findViewById(2131825732));
        paramMultiTalkMainUI.setTag(localObject);
        paramMultiTalkMainUI.setVisibility(8);
        this.oIV = paramMultiTalkMainUI;
        this.oIJ.addView(paramMultiTalkMainUI);
      }
      this.oIJ.setVisibility(8);
      if (p.bSf().bRF())
        this.oIO.setVisibility(0);
      while (true)
      {
        this.oIZ = "";
        bSp();
        AppMethodBeat.o(54203);
        return;
        this.oIO.setVisibility(8);
      }
    }
  }

  private static void a(RelativeLayout paramRelativeLayout, MultiTalkGroupMember paramMultiTalkGroupMember, boolean paramBoolean, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(54206);
    paramRelativeLayout = (f.a)paramRelativeLayout.getTag();
    if (paramMultiTalkGroupMember != null)
    {
      paramRelativeLayout.oJe.Sr(paramMultiTalkGroupMember.Aqh);
      paramRelativeLayout.oJe.setPosition(paramRelativeLayout.oJe.getIndex());
      if (paramMultiTalkGroupMember.status != 10)
      {
        paramRelativeLayout.iVh.setVisibility(0);
        a(paramRelativeLayout);
        if ((!paramHashSet.contains(paramMultiTalkGroupMember.Aqh)) || (paramBoolean))
          break label109;
        paramRelativeLayout.oJe.bSs();
        AppMethodBeat.o(54206);
      }
    }
    while (true)
    {
      return;
      paramRelativeLayout.iVh.setVisibility(8);
      b(paramRelativeLayout);
      break;
      label109: paramRelativeLayout.oJe.bSr();
      AppMethodBeat.o(54206);
      continue;
      paramRelativeLayout.iVh.setVisibility(8);
      b(paramRelativeLayout);
      paramRelativeLayout.oJe.bSt();
      AppMethodBeat.o(54206);
    }
  }

  private static void a(f.a parama)
  {
    AppMethodBeat.i(54220);
    if (parama.ohf.getBackground() != null)
    {
      parama.ohf.setVisibility(0);
      ((AnimationDrawable)parama.ohf.getBackground()).stop();
      ((AnimationDrawable)parama.ohf.getBackground()).start();
    }
    AppMethodBeat.o(54220);
  }

  private void ag(LinkedList<MultiTalkGroupMember> paramLinkedList)
  {
    AppMethodBeat.i(54205);
    this.oJa = paramLinkedList.size();
    Object localObject = this.oII.getLayoutParams();
    int i;
    int j;
    int k;
    HashSet localHashSet;
    int m;
    label170: MultiTalkGroupMember localMultiTalkGroupMember;
    label201: int i1;
    if (this.oJa <= 4)
    {
      i = this.oIS / 2;
      if (this.oIT / 2 > i)
      {
        j = i;
        ((ViewGroup.LayoutParams)localObject).height = (j * 2);
        k = j;
        this.oII.setLayoutParams((ViewGroup.LayoutParams)localObject);
        ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "talkingAvatarWidth: %d | talkingAvatarHeight: %d | size %d", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(this.oJa) });
        localHashSet = new HashSet();
        localHashSet.addAll(p.bSf().oGf);
        if (p.bSf().bRF())
          localHashSet.add(r.Yz());
        if (this.oJa > 4)
          break label487;
        localObject = j.oGR[this.oJa];
        if (localObject == null)
          break label502;
        m = 0;
        if (m >= localObject.length)
          break label502;
        if (this.oJa <= m / 2)
          break label496;
        localMultiTalkGroupMember = (MultiTalkGroupMember)paramLinkedList.get(m / 2);
        int n = (int)(localObject[m] * i);
        i1 = (int)(localObject[(m + 1)] * k);
        j = n;
        if (this.oJa == 2)
        {
          j = n;
          if (n == 0)
            j = 1;
        }
        if ((this.oJa != 4) || (j != 0))
          break label589;
        j = 1;
      }
    }
    label589: 
    while (true)
    {
      RelativeLayout localRelativeLayout = (RelativeLayout)this.oIU.get(m / 2);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams.width = i;
      localLayoutParams.height = k;
      localLayoutParams.leftMargin = j;
      localLayoutParams.topMargin = i1;
      localRelativeLayout.setLayoutParams(localLayoutParams);
      a(localRelativeLayout, localMultiTalkGroupMember, false, localHashSet);
      localRelativeLayout.setVisibility(0);
      ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "setIvLayoutParams, width: %s, height: %s, marginLeft: %s, marginTop: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i1) });
      m += 2;
      break label170;
      j = this.oIT / 2;
      break;
      if (this.oJa <= 9)
      {
        i = this.oIS / 3;
        if (this.oIT / 3 > i);
        for (j = i; ; j = this.oIT / 3)
        {
          ((ViewGroup.LayoutParams)localObject).height = (j * 3);
          k = j;
          break;
        }
      }
      ab.e("MicroMsg.MT.MultiTalkTalkingUILogic", "onlineUserSize larger than 9, %s", new Object[] { Integer.valueOf(this.oJa) });
      AppMethodBeat.o(54205);
      while (true)
      {
        return;
        label487: localObject = j.oGR[5];
        break;
        label496: localMultiTalkGroupMember = null;
        break label201;
        label502: if (this.oJa <= 4)
          for (j = this.oJa; j < 9; j++)
            ((RelativeLayout)this.oIU.get(j)).setVisibility(8);
        if ((p.bSf().bRH()) && (this.oIP != null) && (!this.oIP.isChecked()))
          p.bSf().zf(1);
        AppMethodBeat.o(54205);
      }
    }
  }

  private static void b(f.a parama)
  {
    AppMethodBeat.i(54221);
    if (parama.ohf.getBackground() != null)
      ((AnimationDrawable)parama.ohf.getBackground()).stop();
    parama.ohf.setVisibility(8);
    AppMethodBeat.o(54221);
  }

  private static int x(boolean paramBoolean, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(54208);
    if (!paramBoolean);
    for (int j = -1; ; j = paramInt)
    {
      Object localObject = ByteBuffer.allocate(4);
      ((ByteBuffer)localObject).order(ByteOrder.LITTLE_ENDIAN).putInt(j);
      localObject = ((ByteBuffer)localObject).array();
      int k = p.bSe().oFP.setAppCmd(22, (byte[])localObject, 4);
      if (k < 0)
      {
        ab.e("MicroMsg.MT.MultiTalkTalkingUILogic", "steve:set netBigVideo failed or NO need!, ret:%d, vID:%d, memberId:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(paramInt) });
        AppMethodBeat.o(54208);
      }
      for (paramInt = i; ; paramInt = k)
      {
        return paramInt;
        AppMethodBeat.o(54208);
      }
    }
  }

  public final RelativeLayout Sq(String paramString)
  {
    AppMethodBeat.i(54207);
    Iterator localIterator = this.oIU.iterator();
    while (localIterator.hasNext())
    {
      RelativeLayout localRelativeLayout = (RelativeLayout)localIterator.next();
      if (paramString.equals(((f.a)localRelativeLayout.getTag()).oJe.getUsername()))
      {
        AppMethodBeat.o(54207);
        paramString = localRelativeLayout;
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(54207);
    }
  }

  public final void a(String paramString, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(54217);
      if (this.oIJ.getVisibility() == 0)
      {
        f.a locala = (f.a)this.oIV.getTag();
        if (paramString.equals(locala.oJe.getUsername()))
          locala.oJe.d(paramBitmap, paramInt2, paramInt1);
        AppMethodBeat.o(54217);
      }
      while (true)
      {
        return;
        paramString = Sq(paramString);
        if (paramString != null)
          ((f.a)paramString.getTag()).oJe.d(paramBitmap, paramInt2, paramInt1);
        AppMethodBeat.o(54217);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final void a(String paramString, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(54216);
      if (this.oIJ.getVisibility() == 0)
      {
        f.a locala = (f.a)this.oIV.getTag();
        if (paramString.equals(locala.oJe.getUsername()))
          locala.oJe.b(paramArrayOfInt, paramInt1, paramInt2, paramInt3);
        AppMethodBeat.o(54216);
      }
      while (true)
      {
        return;
        paramString = Sq(paramString);
        if (paramString != null)
          ((f.a)paramString.getTag()).oJe.b(paramArrayOfInt, paramInt1, paramInt2, paramInt3);
        AppMethodBeat.o(54216);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(54215);
    if (!p.bSf().bRH())
    {
      js(false);
      AppMethodBeat.o(54215);
      return;
    }
    if (this.oJc.oHc == null)
    {
      this.oJc.w = paramInt1;
      this.oJc.h = paramInt2;
      this.oJc.oHc = new int[this.oJc.w * this.oJc.h];
    }
    if (!p.bSf().bRF())
    {
      j.bRW();
      p.bSf().zf(3);
    }
    long l1 = System.currentTimeMillis();
    p.bSf().oGe = this.oIW.cLE();
    int i;
    if (this.oIW.cLE())
    {
      i = OpenGlRender.FLAG_Mirror;
      label133: if (!this.oIW.cLF())
        break label265;
    }
    com.tencent.pb.talkroom.sdk.g localg;
    label265: for (int j = OpenGlRender.FLAG_Angle270; ; j = OpenGlRender.FLAG_Angle90)
    {
      localg = p.bSe().oFP.a(paramArrayOfByte, (int)paramLong, this.oJc.w, this.oJc.h, paramInt3 + paramInt4 & 0x1F, this.oJc.oHc);
      if ((localg.ret >= 0) && (this.oJc.oHc != null) && (localg.Aqp != 0) && (localg.Aqq != 0))
        break label273;
      ab.e("MicroMsg.MT.MultiTalkTalkingUILogic", "ret: %d", new Object[] { Integer.valueOf(localg.ret) });
      AppMethodBeat.o(54215);
      break;
      i = 0;
      break label133;
    }
    label273: long l2 = System.currentTimeMillis();
    int k;
    if (i == OpenGlRender.FLAG_Mirror)
    {
      k = 257;
      label291: if (!p.bSf().oGt)
        break label827;
      if (i != OpenGlRender.FLAG_Mirror)
        break label521;
      k = 259;
    }
    label521: label827: 
    while (true)
    {
      paramInt1 = p.bSe().oFP.a(paramArrayOfByte, (short)(int)paramLong, paramInt1, paramInt2, paramInt3 + paramInt4, k);
      paramLong = System.currentTimeMillis();
      long l3 = paramLong - l1;
      if (l3 > 30L)
        ab.d("MicroMsg.MT.MultiTalkTalkingUILogic", "steve: trans size:%dx%d, total: %d, trans: %d, enc: %d", new Object[] { Integer.valueOf(localg.Aqp), Integer.valueOf(localg.Aqq), Long.valueOf(l3), Long.valueOf(l2 - l1), Long.valueOf(paramLong - l2) });
      if (paramInt1 <= 0)
        ab.v("MicroMsg.MT.MultiTalkTalkingUILogic", "send ret = %d", new Object[] { Integer.valueOf(paramInt1) });
      if ((this.oIX != null) && (this.oJc.oHc != null))
      {
        k localk = this.oIX;
        paramArrayOfByte = this.oJc.oHc;
        paramInt1 = localg.Aqp;
        paramInt2 = localg.Aqq;
        if (paramArrayOfByte == null)
        {
          ab.e("MicroMsg.MT.MultiTalkVideoNativeReceiver", "onDrawerReady pBuffer is null");
          AppMethodBeat.o(54215);
          break;
          k = 1;
          break label291;
          k = 3;
          continue;
        }
        if (localk.oGY.eBB)
        {
          ab.d("MicroMsg.MT.MultiTalkVideoNativeReceiver", "onDrawerReady busy!!!!");
          AppMethodBeat.o(54215);
          break;
        }
        if (localk.oGY.oHc == null)
          localk.oGY.oHc = new int[paramArrayOfByte.length];
        localk.oGY.w = paramInt1;
        localk.oGY.h = paramInt2;
        localk.oGY.oHa = (paramInt3 + paramInt4);
        localk.oGY.oHb = i;
        localk.oGY.angle = j;
        paramLong = System.currentTimeMillis();
        paramInt1 = localk.oGY.h;
        if (localk.oGY.h > localk.oGY.w)
          paramInt1 = localk.oGY.w;
        if (localk.oGY.mQQ == null)
          localk.oGY.mQQ = Bitmap.createBitmap(paramInt1, paramInt1, Bitmap.Config.RGB_565);
        if (localk.oGY.mQQ != null)
          localk.oGY.mQQ.setPixels(paramArrayOfByte, localk.oGY.w - localk.oGY.h, localk.oGY.w, 0, 0, paramInt1, paramInt1);
        paramLong = System.currentTimeMillis() - paramLong;
        if (paramLong > 30L)
          ab.d("MicroMsg.MT.MultiTalkVideoNativeReceiver", "steve: createBitmap: %d", new Object[] { Long.valueOf(paramLong) });
        if (localk.oGX != null)
          localk.oGX.post(new k.b(localk));
      }
      AppMethodBeat.o(54215);
      break;
    }
  }

  public final boolean bRh()
  {
    if (this.oIW != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void bSn()
  {
    AppMethodBeat.i(54211);
    Iterator localIterator = this.oIU.iterator();
    while (localIterator.hasNext())
    {
      f.a locala = (f.a)((RelativeLayout)localIterator.next()).getTag();
      if ((!r.Yz().equals(locala.oJe.getUsername())) && (locala.oJe.bSw()))
        locala.oJe.bSr();
    }
    AppMethodBeat.o(54211);
  }

  public final void bSo()
  {
    AppMethodBeat.i(54218);
    ab.e("MicroMsg.MT.MultiTalkTalkingUILogic", "onCameraError");
    if (this.gLj == null)
      this.gLj = com.tencent.mm.bg.e.a(this.oIm, 2131304446, new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(54201);
          f.this.js(false);
          AppMethodBeat.o(54201);
        }
      });
    if (!this.gLj.isShowing())
      this.gLj.show();
    p.bSf().zf(1);
    AppMethodBeat.o(54218);
  }

  public final void bSp()
  {
    AppMethodBeat.i(54222);
    if (this.oIR.isEnabled())
      p.bSf().jq(this.oIR.isChecked());
    AppMethodBeat.o(54222);
  }

  public final void d(HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(54210);
    Iterator localIterator = this.oIU.iterator();
    while (localIterator.hasNext())
    {
      f.a locala = (f.a)((RelativeLayout)localIterator.next()).getTag();
      if (!r.Yz().equals(locala.oJe.getUsername()))
        if (paramHashSet.contains(locala.oJe.getUsername()))
        {
          if (!locala.oJe.bSw())
            locala.oJe.bSs();
        }
        else if (locala.oJe.bSw())
        {
          locala.oJe.bSr();
          if ((locala.oJe.getUsername() != null) && (!locala.oJe.getUsername().equals(r.Yz())))
          {
            ab.d("MicroMsg.MT.MultiTalkTalkingUILogic", "steve: unsubscribe big video!");
            p.bSf().Sj("");
            x(false, -1);
          }
          if ((this.oIZ.equals(locala.oJe.getUsername())) && (this.oIJ.getVisibility() == 0))
          {
            this.oIZ = "";
            this.oIJ.setVisibility(8);
            this.oII.setVisibility(0);
          }
        }
    }
    AppMethodBeat.o(54210);
  }

  public final void jr(boolean paramBoolean)
  {
    AppMethodBeat.i(54212);
    if (!paramBoolean)
      this.oJb = System.currentTimeMillis();
    ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "start capture render");
    if ((this.oIJ != null) && (this.oIJ.getVisibility() == 0));
    for (Object localObject = this.oIm.bSl(); ; localObject = Sq(r.Yz()))
    {
      if (localObject != null)
      {
        if (this.oIY == null)
        {
          ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "create capture View");
          this.oIY = new ObservableTextureView(this.oIm);
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(1, 1);
          this.oIY.setLayoutParams(localLayoutParams);
          ((ViewGroup)localObject).addView(this.oIY);
          this.oIY.setVisibility(0);
        }
        if (this.oIW == null)
        {
          ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "create capture Render");
          this.oIW = new com.tencent.mm.plugin.voip.video.a(320, 240);
          this.oIW.a(this, p.bSf().oGe);
          this.oIW.a(this.oIY);
          this.oIW.cLC();
          ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "captureRender.mIsCurrentFaceCamera=%b captureRender.mIsCameraRemote180=%b", new Object[] { Boolean.valueOf(this.oIW.cLE()), Boolean.valueOf(this.oIW.cLF()) });
        }
        if (this.oIX == null)
        {
          this.oIX = new k(this.oIm);
          this.oIX.start();
        }
      }
      AppMethodBeat.o(54212);
      return;
    }
  }

  public final void js(boolean paramBoolean)
  {
    AppMethodBeat.i(54213);
    if ((!paramBoolean) && (this.oJb != 0L) && (System.currentTimeMillis() - this.oJb > 0L) && (p.bSf().bRc()))
    {
      com.tencent.mm.plugin.multitalk.model.e.r(System.currentTimeMillis() - this.oJb, j.bRU());
      this.oJb = 0L;
    }
    ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "stop capture render");
    if (this.oIY != null)
    {
      ViewParent localViewParent = this.oIY.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.oIY);
      this.oIY = null;
    }
    if (this.oIW != null)
    {
      this.oIW.cLD();
      this.oIW = null;
    }
    if (this.oIX != null)
    {
      this.oIX.stop();
      this.oIX = null;
    }
    AppMethodBeat.o(54213);
  }

  public final void jt(boolean paramBoolean)
  {
    AppMethodBeat.i(54214);
    ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "onRefreshed");
    this.oJa = 0;
    if (!paramBoolean)
      al.d(new f.1(this));
    js(false);
    Iterator localIterator = this.oIU.iterator();
    while (localIterator.hasNext())
      ((f.a)((RelativeLayout)localIterator.next()).getTag()).oJe.setSurfaceTextureListener(null);
    o.acd().b(this);
    AppMethodBeat.o(54214);
  }

  public final void o(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(54204);
    this.oIL.setVisibility(0);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramMultiTalkGroup.Aqg.iterator();
    while (localIterator.hasNext())
    {
      paramMultiTalkGroup = (MultiTalkGroupMember)localIterator.next();
      if ((paramMultiTalkGroup.status == 10) || (paramMultiTalkGroup.status == 1))
        localLinkedList.add(paramMultiTalkGroup);
    }
    ag(localLinkedList);
    bSp();
    AppMethodBeat.o(54204);
  }

  public final void onClick(View paramView)
  {
    boolean bool1 = true;
    AppMethodBeat.i(54209);
    Object localObject1;
    String str;
    Object localObject2;
    if ((paramView instanceof MultiTalkVideoView))
    {
      localObject1 = (MultiTalkVideoView)paramView;
      if (this.oIJ.getVisibility() == 8)
      {
        if (!((MultiTalkVideoView)localObject1).bSw())
        {
          AppMethodBeat.o(54209);
          return;
        }
        this.oIJ.setVisibility(0);
        this.oII.setVisibility(8);
        paramView = new FrameLayout.LayoutParams(-2, -2);
        paramView.width = this.oIS;
        paramView.height = this.oIS;
        paramView.leftMargin = 0;
        paramView.topMargin = 0;
        this.oIV.setLayoutParams(paramView);
        str = ((MultiTalkVideoView)localObject1).getUsername();
        localObject1 = null;
        paramView = null;
        if (p.bSf().oGh != null)
        {
          localObject2 = p.bSf().oGh.Aqg.iterator();
          label144: localObject1 = paramView;
          if (((Iterator)localObject2).hasNext())
          {
            localObject1 = (MultiTalkGroupMember)((Iterator)localObject2).next();
            if (((((MultiTalkGroupMember)localObject1).status != 10) && (((MultiTalkGroupMember)localObject1).status != 1)) || (!((MultiTalkGroupMember)localObject1).Aqh.equals(str)))
              break label1150;
            paramView = (View)localObject1;
          }
        }
      }
    }
    label458: label1135: label1150: 
    while (true)
    {
      break label144;
      paramView = p.bSf().oGh.Aqc;
      paramView = com.tencent.wecall.talkroom.model.c.dTg().auE(paramView);
      if (paramView != null)
      {
        localObject2 = paramView.dTa().iterator();
        do
        {
          if (!((Iterator)localObject2).hasNext())
            break;
          paramView = (a.av)((Iterator)localObject2).next();
        }
        while (!paramView.Aop.equals(str));
      }
      for (int i = paramView.kyZ; ; i = 0)
      {
        if (!str.equals(r.Yz()))
        {
          ab.d("MicroMsg.MT.MultiTalkTalkingUILogic", "steve:click memberId:%d", new Object[] { Integer.valueOf(i) });
          p.bSf().Sj(str);
          x(true, i);
        }
        boolean bool2 = bool1;
        if (!at.is2G(this.oIm))
          if (!at.is3G(this.oIm))
            break label458;
        for (bool2 = bool1; ; bool2 = false)
        {
          paramView = new HashSet();
          paramView.addAll(p.bSf().oGf);
          if (p.bSf().bRF())
            paramView.add(r.Yz());
          localObject2 = (f.a)this.oIV.getTag();
          ((f.a)localObject2).oJe.Sr(str);
          ((f.a)localObject2).oJe.bSt();
          this.oIV.setTag(localObject2);
          a(this.oIV, (MultiTalkGroupMember)localObject1, bool2, paramView);
          this.oIV.setVisibility(0);
          this.oIZ = str;
          com.tencent.mm.plugin.multitalk.model.e.bRD();
          AppMethodBeat.o(54209);
          break;
        }
        if ((((MultiTalkVideoView)localObject1).getUsername() != null) && (!((MultiTalkVideoView)localObject1).getUsername().equals(r.Yz())))
        {
          ab.d("MicroMsg.MT.MultiTalkTalkingUILogic", "steve: unsubscribe big video!");
          p.bSf().Sj("");
          x(false, -1);
        }
        this.oIJ.setVisibility(8);
        this.oII.setVisibility(0);
        if (this.oIV != null)
        {
          paramView = (f.a)this.oIV.getTag();
          if (paramView != null)
            paramView.oJe.bSt();
        }
        this.oIZ = "";
        com.tencent.mm.plugin.multitalk.model.e.bRE();
        AppMethodBeat.o(54209);
        break;
        if (paramView.getId() == 2131826232)
        {
          p.bSf().h(true, false, false);
          AppMethodBeat.o(54209);
          break;
        }
        if (paramView.getId() == 2131826226)
        {
          com.tencent.mm.plugin.multitalk.model.e.oFV += 1;
          p.bSf().jn(true);
          com.tencent.mm.plugin.multitalk.model.e.bRC();
          AppMethodBeat.o(54209);
          break;
        }
        if (paramView.getId() == 2131826231)
        {
          if (!this.oIR.isEnabled())
            break label1135;
          com.tencent.mm.plugin.multitalk.model.e.oFX += 1;
          p.bSf().jo(this.oIR.isChecked());
          bSp();
          if (this.oIR.isChecked())
          {
            com.tencent.mm.plugin.multitalk.model.e.bRx();
            AppMethodBeat.o(54209);
            break;
          }
          com.tencent.mm.plugin.multitalk.model.e.bRy();
          AppMethodBeat.o(54209);
          break;
        }
        if (paramView.getId() == 2131826229)
        {
          com.tencent.mm.plugin.multitalk.model.e.oFW += 1;
          paramView = p.bSf();
          bool2 = this.oIQ.isChecked();
          p.bSe().oFP.rm(bool2);
          paramView.jg(bool2);
          if (this.oIQ.isChecked())
          {
            com.tencent.mm.plugin.multitalk.model.e.bRv();
            AppMethodBeat.o(54209);
            break;
          }
          com.tencent.mm.plugin.multitalk.model.e.bRw();
          AppMethodBeat.o(54209);
          break;
        }
        if (paramView.getId() == 2131826233)
        {
          if (this.oIW != null)
            this.oIW.cLB();
          com.tencent.mm.plugin.multitalk.model.e.bRB();
          AppMethodBeat.o(54209);
          break;
        }
        if (paramView.getId() == 2131826230)
        {
          com.tencent.mm.plugin.multitalk.model.e.oFY += 1;
          bool2 = com.tencent.mm.pluginsdk.permission.b.a(this.oIm.mController.ylL, "android.permission.CAMERA", 22, "", "");
          ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "summerper checkPermission checkcamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool2), bo.dpG(), this.oIm.mController.ylL });
          if (!bool2);
          for (i = 0; ; i = 1)
          {
            if (i != 0)
              break label950;
            this.oIP.setChecked(false);
            AppMethodBeat.o(54209);
            break;
          }
          if (!p.bSf().bRH())
          {
            this.oIP.setChecked(false);
            AppMethodBeat.o(54209);
            break;
          }
          if (!at.isNetworkConnected(this.oIm))
          {
            com.tencent.mm.bg.e.a(this.oIm, 2131304445, null);
            this.oIP.setChecked(false);
            AppMethodBeat.o(54209);
            break;
          }
          if (!j.bRY())
          {
            Toast.makeText(this.oIm, 2131301524, 1).show();
            this.oIP.setChecked(false);
            AppMethodBeat.o(54209);
            break;
          }
          if (this.oIP.isChecked())
          {
            jr(false);
            com.tencent.mm.plugin.multitalk.model.e.bRz();
          }
          while (true)
          {
            this.oIP.setChecked(p.bSf().bRF());
            AppMethodBeat.o(54209);
            break;
            js(false);
            p.bSf().zf(1);
            com.tencent.mm.plugin.multitalk.model.e.bRA();
          }
        }
        if (paramView.getId() == 2131826227)
        {
          com.tencent.mm.plugin.multitalk.model.e.oFZ += 1;
          this.oIm.bSk();
        }
        AppMethodBeat.o(54209);
        break;
      }
    }
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(54219);
    ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "notifyChanged %s", new Object[] { paramString });
    paramString = Sq(paramString);
    if (paramString != null)
      ((f.a)paramString.getTag()).oJe.bSq();
    AppMethodBeat.o(54219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.widget.f
 * JD-Core Version:    0.6.2
 */