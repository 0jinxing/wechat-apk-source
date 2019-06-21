package com.tencent.mm.chatroom.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.r;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.p;

public final class SelectedMemberChattingRecordUI$a extends p<bi>
{
  String emZ;
  String emo;
  int ena;
  int enb;
  private u enc;
  Context mContext;

  public SelectedMemberChattingRecordUI$a(SelectedMemberChattingRecordUI paramSelectedMemberChattingRecordUI, Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    super(paramContext, new bi());
    AppMethodBeat.i(104439);
    this.ena = -1;
    this.enb = -1;
    this.mContext = paramContext;
    this.enb = paramInt;
    this.emo = paramString1;
    this.emZ = paramString2;
    this.enc = ((c)g.K(c.class)).XV().ob(SelectedMemberChattingRecordUI.b(paramSelectedMemberChattingRecordUI));
    AppMethodBeat.o(104439);
  }

  private static boolean a(CharSequence paramCharSequence, TextView paramTextView)
  {
    boolean bool = false;
    AppMethodBeat.i(104443);
    if ((paramCharSequence != null) && (paramCharSequence.length() != 0))
    {
      paramTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramTextView.getContext(), paramCharSequence));
      paramTextView.setVisibility(0);
      bool = true;
      AppMethodBeat.o(104443);
    }
    while (true)
    {
      return bool;
      paramTextView.setVisibility(8);
      AppMethodBeat.o(104443);
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(104440);
    if ((this.ena < 0) || (this.ena > this.enb))
      this.ena = (this.enb - 16);
    if ((!bo.isNullOrNil(SelectedMemberChattingRecordUI.c(this.emY))) && (r.mG(SelectedMemberChattingRecordUI.c(this.emY))))
    {
      setCursor(((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().cB(this.emo, this.enb - this.ena));
      AppMethodBeat.o(104440);
    }
    while (true)
    {
      return;
      if (!r.mG(SelectedMemberChattingRecordUI.c(this.emY)))
        setCursor(((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().G(this.emo, this.emZ, this.enb - this.ena));
      AppMethodBeat.o(104440);
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(104441);
    KC();
    AppMethodBeat.o(104441);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104442);
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = LayoutInflater.from(this.context).inflate(2130970081, null, false);
      paramView = new SelectedMemberChattingRecordUI.b((byte)0);
      paramView.ejo = ((ImageView)paramViewGroup.findViewById(2131821183));
      paramView.ejp = ((TextView)paramViewGroup.findViewById(2131823149));
      paramView.ene = ((TextView)paramViewGroup.findViewById(2131822913));
      paramView.enf = ((TextView)paramViewGroup.findViewById(2131823150));
      paramViewGroup.setTag(paramView);
    }
    bi localbi = (bi)getItem(paramInt);
    SelectedMemberChattingRecordUI.b localb = (SelectedMemberChattingRecordUI.b)paramViewGroup.getTag();
    a.b.b(localb.ejo, this.emZ);
    paramView = this.emZ;
    Object localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramView);
    if (!bo.isNullOrNil(((ap)localObject1).field_conRemark))
    {
      paramView = ((ap)localObject1).field_conRemark;
      if (!bo.isNullOrNil(paramView))
        break label342;
      paramView = ((ad)localObject1).Oi();
    }
    label342: 
    while (true)
    {
      Object localObject2 = paramView;
      if (!a.jh(((ap)localObject1).field_type))
      {
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XN().RB(((ap)localObject1).field_username);
        localObject2 = paramView;
        if (localObject1 != null)
        {
          localObject2 = paramView;
          if (!bo.isNullOrNil(((bv)localObject1).field_conRemark))
            localObject2 = ((bv)localObject1).field_conRemark;
        }
      }
      a((CharSequence)localObject2, localb.ejp);
      paramView = this.emZ;
      a(SelectedMemberChattingRecordUI.a(ah.getContext(), localbi.getType(), localbi.field_content, paramView, localbi.field_isSend).trim(), localb.ene);
      a(com.tencent.mm.pluginsdk.f.h.c(this.emY, localbi.field_createTime, true), localb.enf);
      AppMethodBeat.o(104442);
      return paramViewGroup;
      paramView = SelectedMemberChattingRecordUI.a(this.enc, ((ap)localObject1).field_username);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI.a
 * JD-Core Version:    0.6.2
 */