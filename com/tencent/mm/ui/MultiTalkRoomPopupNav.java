package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiTalkRoomPopupNav extends LinearLayout
{
  private LinearLayout yoK;
  private View yoL;
  private TextView yoM;
  private TextView yoN;
  private TextView yoO;
  private String yoP;
  private String yoQ;
  private boolean yoR;
  private MultiTalkRoomPopupNav.b yoS;
  private MultiTalkRoomPopupNav.a yoT;
  private final int yoU;
  private LinearLayout yoV;
  public boolean yoW;
  private f yoX;

  public MultiTalkRoomPopupNav(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(29778);
    this.yoS = MultiTalkRoomPopupNav.b.ypc;
    this.yoU = 6;
    this.yoW = false;
    this.yoX = new f();
    initView();
    AppMethodBeat.o(29778);
  }

  @TargetApi(11)
  public MultiTalkRoomPopupNav(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(29777);
    this.yoS = MultiTalkRoomPopupNav.b.ypc;
    this.yoU = 6;
    this.yoW = false;
    this.yoX = new f();
    initView();
    AppMethodBeat.o(29777);
  }

  private void d(String paramString1, List<String> paramList, final String paramString2)
  {
    AppMethodBeat.i(29785);
    this.yoL.setVisibility(8);
    this.yoK.setVisibility(8);
    if (this.yoS == MultiTalkRoomPopupNav.b.ypa);
    MultiTalkRoomPopupNav.a locala;
    View.OnClickListener local2;
    for (boolean bool = true; ; bool = false)
    {
      this.yoT = new MultiTalkRoomPopupNav.a(this, bool, (byte)0);
      locala = this.yoT;
      local2 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(29770);
          ab.i("MicroMsg.MultiTalkRoomPopupNav", "click enter button..");
          if (paramString2 != null)
          {
            if (((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).bRb())
            {
              ab.e("MicroMsg.MultiTalkRoomPopupNav", "now is in other voip..");
              com.tencent.mm.ui.base.h.b(MultiTalkRoomPopupNav.this.getContext(), ah.getContext().getString(2131301550), null, true);
              AppMethodBeat.o(29770);
              return;
            }
            paramAnonymousView = ((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RY(MultiTalkRoomPopupNav.b(MultiTalkRoomPopupNav.this));
            if (paramAnonymousView.size() != 1)
              break label247;
            MultiTalkRoomPopupNav.aqH(paramString2);
            com.tencent.mm.plugin.report.service.h.pYm.e(13945, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), MultiTalkRoomPopupNav.b(MultiTalkRoomPopupNav.this), Integer.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomId), Long.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomKey) });
          }
          while (true)
          {
            MultiTalkRoomPopupNav.e(MultiTalkRoomPopupNav.this).close();
            MultiTalkRoomPopupNav.f(MultiTalkRoomPopupNav.this).setVisibility(0);
            MultiTalkRoomPopupNav.g(MultiTalkRoomPopupNav.this).setVisibility(0);
            MultiTalkRoomPopupNav.h(MultiTalkRoomPopupNav.this).setVisibility(8);
            AppMethodBeat.o(29770);
            break;
            label247: int i;
            if (paramAnonymousView.size() >= 9)
            {
              ab.e("MicroMsg.MultiTalkRoomPopupNav", "now is up to the limit,memberList size:" + paramAnonymousView.size());
              com.tencent.mm.ui.base.h.b(MultiTalkRoomPopupNav.this.getContext(), ah.getContext().getString(2131301554, new Object[] { Integer.valueOf(9) }), null, true);
              paramAnonymousView = com.tencent.mm.plugin.report.service.h.pYm;
              if (MultiTalkRoomPopupNav.d(MultiTalkRoomPopupNav.this) == MultiTalkRoomPopupNav.b.ypa);
              for (i = 1; ; i = 0)
              {
                paramAnonymousView.e(13945, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(1), MultiTalkRoomPopupNav.b(MultiTalkRoomPopupNav.this), Integer.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomId), Long.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomKey) });
                AppMethodBeat.o(29770);
                break;
              }
            }
            if (((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).bRa())
            {
              ab.e("MicroMsg.MultiTalkRoomPopupNav", "now is inviting other people voip..");
              com.tencent.mm.ui.base.h.b(MultiTalkRoomPopupNav.this.getContext(), ah.getContext().getString(2131301548), null, true);
              paramAnonymousView = com.tencent.mm.plugin.report.service.h.pYm;
              if (MultiTalkRoomPopupNav.d(MultiTalkRoomPopupNav.this) == MultiTalkRoomPopupNav.b.ypa);
              for (i = 1; ; i = 0)
              {
                paramAnonymousView.e(13945, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(1), MultiTalkRoomPopupNav.b(MultiTalkRoomPopupNav.this), Integer.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomId), Long.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomKey) });
                AppMethodBeat.o(29770);
                break;
              }
            }
            MultiTalkRoomPopupNav.a(MultiTalkRoomPopupNav.this, paramString2);
          }
        }
      };
      paramString2 = new MultiTalkRoomPopupNav.3(this, paramString2);
      locala.titleView.setText(paramString1);
      locala.yoZ.setVisibility(0);
      locala.yoY.yoV.setVisibility(0);
      locala.yoY.yoV.removeAllViews();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (String)localIterator.next();
        ImageView localImageView = new ImageView(locala.yoY.getContext());
        paramString1 = new LinearLayout.LayoutParams(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 26), com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 26));
        paramString1.rightMargin = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 10);
        localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        localImageView.setLayoutParams(paramString1);
        locala.yoY.yoV.addView(localImageView);
        a.b.b(localImageView, paramList);
      }
    }
    ((Button)locala.yoY.findViewById(2131826246)).setOnClickListener(local2);
    ((Button)locala.yoY.findViewById(2131826245)).setOnClickListener(paramString2);
    AppMethodBeat.o(29785);
  }

  private void eM(List<String> paramList)
  {
    AppMethodBeat.i(29786);
    if ((this.yoV != null) && (this.yoV.getVisibility() == 0))
    {
      this.yoV.removeAllViews();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ImageView localImageView = new ImageView(getContext());
        paramList = new LinearLayout.LayoutParams(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 26), com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 26));
        paramList.rightMargin = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 10);
        localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        localImageView.setLayoutParams(paramList);
        this.yoV.addView(localImageView);
        a.b.b(localImageView, str);
      }
    }
    AppMethodBeat.o(29786);
  }

  private void initView()
  {
    AppMethodBeat.i(29779);
    inflate(getContext(), 2130970267, this);
    this.yoK = ((LinearLayout)findViewById(2131826235));
    this.yoL = findViewById(2131826234);
    this.yoM = ((TextView)findViewById(2131826237));
    this.yoN = ((TextView)findViewById(2131826238));
    this.yoO = ((TextView)findViewById(2131826239));
    this.yoV = ((LinearLayout)findViewById(2131826242));
    this.yoK.setOnClickListener(new MultiTalkRoomPopupNav.1(this));
    AppMethodBeat.o(29779);
  }

  private static List<String> k(List<String> paramList, String paramString)
  {
    AppMethodBeat.i(29787);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject = paramList;
    if (paramString != null)
    {
      localObject = paramList;
      if (paramString != "")
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          localObject = (String)paramList.next();
          if ((localObject != null) && (!((String)localObject).equals(paramString)))
            localArrayList2.add(localObject);
        }
        localObject = localArrayList2;
      }
    }
    paramList = ((List)localObject).iterator();
    while (paramList.hasNext())
      localArrayList1.add((String)paramList.next());
    AppMethodBeat.o(29787);
    return localArrayList1;
  }

  private void setDefaultBannerStyle(String paramString)
  {
    AppMethodBeat.i(29783);
    this.yoL.setBackgroundResource(2130839625);
    this.yoM.setTextColor(getResources().getColor(2131690294));
    this.yoM.setText(paramString);
    if ((this.yoV == null) || (this.yoV.getVisibility() != 0))
    {
      this.yoM.setVisibility(0);
      this.yoO.setVisibility(8);
      this.yoN.setVisibility(8);
      this.yoV.setVisibility(8);
    }
    AppMethodBeat.o(29783);
  }

  private void setInvitingBannerStyle(String paramString)
  {
    AppMethodBeat.i(29782);
    this.yoL.setBackgroundResource(2130839633);
    this.yoN.setTextColor(getResources().getColor(2131690294));
    this.yoN.setText(paramString);
    this.yoM.setVisibility(8);
    this.yoO.setVisibility(0);
    this.yoN.setVisibility(0);
    this.yoV.setVisibility(8);
    AppMethodBeat.o(29782);
  }

  private void setTalkingBannerStyle(String paramString)
  {
    AppMethodBeat.i(29781);
    this.yoL.setBackgroundResource(2130839633);
    this.yoM.setTextColor(getResources().getColor(2131690296));
    this.yoM.setText(paramString);
    this.yoM.setVisibility(0);
    this.yoO.setVisibility(8);
    this.yoN.setVisibility(8);
    AppMethodBeat.o(29781);
  }

  public final void dyV()
  {
    AppMethodBeat.i(29784);
    this.yoW = false;
    setVisibility(8);
    if (this.yoT != null)
      this.yoT.close();
    AppMethodBeat.o(29784);
  }

  public final void pV(boolean paramBoolean)
  {
    AppMethodBeat.i(29780);
    this.yoW = false;
    if ((this.yoP == null) || (this.yoQ == null))
    {
      ab.e("MicroMsg.MultiTalkRoomPopupNav", "groupUserName or currentSenderUserName is null! groupUserName:" + this.yoP + ",currentSenderUserName:" + this.yoQ);
      AppMethodBeat.o(29780);
    }
    String str;
    List localList;
    int i;
    while (true)
    {
      return;
      str = this.yoP;
      if (!((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RV(str))
      {
        dyV();
        AppMethodBeat.o(29780);
      }
      else
      {
        localList = ((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RY(str);
        if (localList.size() == 0)
        {
          ((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).pI(str);
          dyV();
          AppMethodBeat.o(29780);
        }
        else
        {
          i = ((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).fg(str, this.yoQ);
          if (i != 1)
            break label328;
          setUserTalkingStatus(MultiTalkRoomPopupNav.b.ypa);
          if (!((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RZ(str))
            break;
          dyV();
          AppMethodBeat.o(29780);
        }
      }
    }
    setInvitingBannerStyle(((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).mJ(((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).fh(str, this.yoQ)));
    while (true)
    {
      setVisibility(0);
      this.yoK.setVisibility(0);
      this.yoL.setVisibility(0);
      if ((this.yoT != null) && ((paramBoolean) || (this.yoV == null) || (this.yoV.getVisibility() != 0)))
        this.yoT.close();
      eM(k(localList, ""));
      AppMethodBeat.o(29780);
      break;
      label328: if (i == 10)
      {
        setUserTalkingStatus(MultiTalkRoomPopupNav.b.ypb);
        if (((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RZ(str))
        {
          dyV();
          AppMethodBeat.o(29780);
          break;
        }
        if (((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).bRd())
        {
          dyV();
          AppMethodBeat.o(29780);
          break;
        }
        setUserTalkingStatus(MultiTalkRoomPopupNav.b.ypc);
        setDefaultBannerStyle(ah.getContext().getString(2131301565, new Object[] { Integer.valueOf(localList.size()) }));
        continue;
      }
      setUserTalkingStatus(MultiTalkRoomPopupNav.b.ypc);
      setDefaultBannerStyle(ah.getContext().getString(2131301565, new Object[] { Integer.valueOf(localList.size()) }));
    }
  }

  public void setCurrentSenderUserName(String paramString)
  {
    this.yoQ = paramString;
  }

  public void setGroupUserName(String paramString)
  {
    this.yoP = paramString;
  }

  public void setInChatRoom(boolean paramBoolean)
  {
    this.yoR = paramBoolean;
  }

  public void setMultiTalkInfo(f paramf)
  {
    this.yoX = paramf;
  }

  public void setUserTalkingStatus(MultiTalkRoomPopupNav.b paramb)
  {
    this.yoS = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MultiTalkRoomPopupNav
 * JD-Core Version:    0.6.2
 */