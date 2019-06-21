package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.p;

final class SnsStrangerCommentDetailUI$a extends p<com.tencent.mm.plugin.sns.storage.j>
{
  private Activity czX;
  private View.OnClickListener jNC;

  public SnsStrangerCommentDetailUI$a(SnsStrangerCommentDetailUI paramSnsStrangerCommentDetailUI, Activity paramActivity)
  {
    super(paramActivity, new com.tencent.mm.plugin.sns.storage.j());
    AppMethodBeat.i(39324);
    this.jNC = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(39322);
        paramAnonymousView = (String)paramAnonymousView.getTag();
        ab.d("MicroMsg.SnsStrangerCommentDetailUI", "onCommentClick:".concat(String.valueOf(paramAnonymousView)));
        Intent localIntent = new Intent();
        localIntent.putExtra("Contact_User", paramAnonymousView);
        com.tencent.mm.plugin.sns.c.a.gkE.c(localIntent, SnsStrangerCommentDetailUI.a.a(SnsStrangerCommentDetailUI.a.this));
        AppMethodBeat.o(39322);
      }
    };
    this.czX = paramActivity;
    AppMethodBeat.o(39324);
  }

  public final void KC()
  {
    AppMethodBeat.i(39326);
    k localk = af.cnK();
    String str = SnsStrangerCommentDetailUI.l(this.rxw);
    long l = SnsStrangerCommentDetailUI.m(this.rxw);
    str = k.cqE() + " where talker = " + h.escape(str) + " and  snsID = " + l + " and ( type = 3 or type = 5 )";
    ab.v("MicroMsg.SnsCommentStorage", "comment sql:".concat(String.valueOf(str)));
    setCursor(localk.fni.a(str, null, 0));
    AppMethodBeat.o(39326);
  }

  public final void KD()
  {
    AppMethodBeat.i(39327);
    KC();
    AppMethodBeat.o(39327);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(39325);
    if (paramView == null)
    {
      paramViewGroup = new SnsStrangerCommentDetailUI.a.a(this);
      paramView = View.inflate(this.czX, 2130970804, null);
      paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131827859));
      paramViewGroup.gKl = ((TextView)paramView.findViewById(2131827861));
      paramViewGroup.pnE = ((TextView)paramView.findViewById(2131827860));
      paramViewGroup.qeX = ((TextView)paramView.findViewById(2131827863));
      paramViewGroup.timeTv = ((TextView)paramView.findViewById(2131827864));
      paramViewGroup.rxz = ((ImageView)paramView.findViewById(2131827862));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      Object localObject1 = (com.tencent.mm.plugin.sns.storage.j)getItem(paramInt);
      try
      {
        localObject2 = new com/tencent/mm/protocal/protobuf/can;
        ((can)localObject2).<init>();
        localcan = (can)((can)localObject2).parseFrom(((com.tencent.mm.plugin.sns.storage.j)localObject1).field_curActionBuf);
        a.b.t(paramViewGroup.ejo, localcan.wPm);
        paramViewGroup.ejo.setTag(localcan.wPm);
        paramViewGroup.ejo.setOnClickListener(this.jNC);
        if (localcan.wZD != null)
        {
          localObject2 = localcan.wZD;
          label197: paramViewGroup.pnE.setTag(localcan.wPm);
          SpannableString localSpannableString = com.tencent.mm.pluginsdk.ui.e.j.b(this.czX, (CharSequence)localObject2, paramViewGroup.pnE.getTextSize());
          Object localObject3 = new com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$a$2;
          ((SnsStrangerCommentDetailUI.a.2)localObject3).<init>(this, localcan.wPm);
          localSpannableString.setSpan(localObject3, 0, ((String)localObject2).length(), 33);
          paramViewGroup.pnE.setText(localSpannableString, TextView.BufferType.SPANNABLE);
          localObject2 = paramViewGroup.pnE;
          localObject3 = new com/tencent/mm/plugin/sns/ui/aa;
          ((aa)localObject3).<init>();
          ((TextView)localObject2).setOnTouchListener((View.OnTouchListener)localObject3);
          if (((com.tencent.mm.plugin.sns.storage.j)localObject1).field_type != 3)
            break label547;
          paramViewGroup.gKl.setVisibility(0);
          paramViewGroup.rxz.setVisibility(8);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("source:");
          ab.v("MicroMsg.SnsStrangerCommentDetailUI", localcan.vFH + "  time:" + localcan.pcX + " timeFormatted:" + aw.l(this.czX, localcan.pcX * 1000L));
          localObject2 = paramViewGroup.gKl;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((TextView)localObject2).setText(localcan.ncM + " ");
          com.tencent.mm.pluginsdk.ui.e.j.h(paramViewGroup.gKl, 2);
          paramViewGroup.gKl.setVisibility(0);
        }
        while (true)
        {
          if (!r.Yz().equals(localcan.wPm))
            break label585;
          paramViewGroup.qeX.setVisibility(8);
          localObject2 = paramViewGroup.timeTv;
          paramViewGroup = new java/lang/StringBuilder;
          paramViewGroup.<init>();
          ((TextView)localObject2).setText(aw.l(this.czX, localcan.pcX * 1000L));
          AppMethodBeat.o(39325);
          return paramView;
          paramViewGroup = (SnsStrangerCommentDetailUI.a.a)paramView.getTag();
          break;
          localObject2 = ((com.tencent.mm.plugin.sns.storage.j)this.ylb).field_talker;
          break label197;
          label547: paramViewGroup.gKl.setVisibility(8);
          paramViewGroup.rxz.setVisibility(0);
        }
      }
      catch (Exception paramViewGroup)
      {
        while (true)
        {
          can localcan;
          ab.printErrStackTrace("MicroMsg.SnsStrangerCommentDetailUI", paramViewGroup, "", new Object[0]);
          continue;
          label585: paramViewGroup.qeX.setVisibility(0);
          Object localObject2 = paramViewGroup.qeX;
          switch (localcan.vFH)
          {
          case 19:
          case 20:
          case 21:
          default:
            ((TextView)localObject2).setText(this.rxw.getString(2131303643));
            ((TextView)localObject2).setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.bz.a.g(this.czX, 2130839820), null);
            break;
          case 22:
          case 23:
          case 24:
          case 26:
          case 27:
          case 28:
          case 29:
            ((TextView)localObject2).setText(this.rxw.getString(2131303642));
            ((TextView)localObject2).setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.bz.a.g(this.czX, 2130839821), null);
            break;
          case 18:
            ((TextView)localObject2).setText(this.rxw.getString(2131303640));
            ((TextView)localObject2).setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.bz.a.g(this.czX, 2130839819), null);
            break;
          case 25:
            ((TextView)localObject2).setText(this.rxw.getString(2131303639));
            ((TextView)localObject2).setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.bz.a.g(this.czX, 2130839817), null);
            break;
          case 30:
            ((TextView)localObject2).setText(this.rxw.getString(2131303641));
            ((TextView)localObject2).setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.bz.a.g(this.czX, 2130839818), null);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.a
 * JD-Core Version:    0.6.2
 */