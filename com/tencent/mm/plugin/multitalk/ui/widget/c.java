package com.tencent.mm.plugin.multitalk.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.multitalk.model.f;
import com.tencent.mm.plugin.multitalk.model.p;
import com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.ArrayList;
import java.util.List;

public final class c
  implements View.OnClickListener
{
  private TextView jKM;
  private MultiTalkMainUI oIm;
  private View oIn;
  private TextView oIo;
  private ImageView oIp;
  private LinearLayout oIq;
  private ImageButton oIr;
  private ImageButton oIs;

  public c(MultiTalkMainUI paramMultiTalkMainUI)
  {
    AppMethodBeat.i(54188);
    this.oIm = paramMultiTalkMainUI;
    this.oIn = paramMultiTalkMainUI.findViewById(2131826215);
    this.oIo = ((TextView)paramMultiTalkMainUI.findViewById(2131826217));
    this.oIp = ((ImageView)paramMultiTalkMainUI.findViewById(2131826216));
    this.oIq = ((LinearLayout)paramMultiTalkMainUI.findViewById(2131826219));
    this.jKM = ((TextView)paramMultiTalkMainUI.findViewById(2131826218));
    this.oIr = ((ImageButton)paramMultiTalkMainUI.findViewById(2131826221));
    this.oIs = ((ImageButton)paramMultiTalkMainUI.findViewById(2131826220));
    this.oIr.setOnClickListener(this);
    this.oIs.setOnClickListener(this);
    AppMethodBeat.o(54188);
  }

  public final void bSm()
  {
    AppMethodBeat.i(54190);
    this.oIn.setVisibility(8);
    AppMethodBeat.o(54190);
  }

  public final void n(MultiTalkGroup paramMultiTalkGroup)
  {
    int i = 0;
    AppMethodBeat.i(54189);
    this.oIn.setVisibility(0);
    Object localObject = com.tencent.mm.plugin.multitalk.model.j.bRV();
    ArrayList localArrayList = new ArrayList();
    int j;
    if (!bo.isNullOrNil((String)localObject))
    {
      for (j = 0; j < paramMultiTalkGroup.Aqg.size(); j++)
        if (!((MultiTalkGroupMember)paramMultiTalkGroup.Aqg.get(j)).Aqh.equals(localObject))
          localArrayList.add(((MultiTalkGroupMember)paramMultiTalkGroup.Aqg.get(j)).Aqh);
      this.oIo.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.oIm, s.mJ((String)localObject)));
      a.b.a(this.oIp, (String)localObject, 0.1F, true);
    }
    if (localArrayList.size() > 0)
    {
      this.jKM.setVisibility(0);
      this.jKM.setText(2131301552);
      this.oIq.setVisibility(0);
      this.oIq.removeAllViews();
      for (j = i; j < localArrayList.size(); j++)
      {
        paramMultiTalkGroup = new ImageView(this.oIm.mController.ylL);
        i = b.oIf;
        localObject = new LinearLayout.LayoutParams(i, i);
        if (j != 0)
          ((LinearLayout.LayoutParams)localObject).leftMargin = b.oId;
        paramMultiTalkGroup.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.oIq.addView(paramMultiTalkGroup);
        a.b.b(paramMultiTalkGroup, (String)localArrayList.get(j));
      }
      AppMethodBeat.o(54189);
    }
    while (true)
    {
      return;
      this.jKM.setVisibility(8);
      this.oIq.setVisibility(8);
      AppMethodBeat.o(54189);
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(54191);
    if (paramView.getId() == 2131826220)
    {
      p.bSf().h(true, false, false);
      AppMethodBeat.o(54191);
    }
    while (true)
    {
      return;
      if (paramView.getId() == 2131826221)
      {
        paramView = p.bSf();
        if (paramView.bRd())
        {
          ab.i("MicroMsg.MT.MultiTalkManager", "acceptCurrentMultiTalk: %s", new Object[] { com.tencent.mm.plugin.multitalk.model.j.h(paramView.oGh) });
          p.bSe().oFP.A(paramView.oGh.Aqc, paramView.oGh.AlR, paramView.oGh.Aqe);
          AppMethodBeat.o(54191);
        }
        else
        {
          ab.e("MicroMsg.MT.MultiTalkManager", "acceptCurrentMultiTalk: Not in MultiTalking");
        }
      }
      else
      {
        AppMethodBeat.o(54191);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.widget.c
 * JD-Core Version:    0.6.2
 */