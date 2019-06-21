package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.p;

public final class u extends p<bi>
{
  private String fsg;
  private String mHZ;
  public String talker;
  private boolean yFW;
  public u.a yKp;

  public u(Context paramContext, bi parambi, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext, parambi);
    this.talker = paramString1;
    this.fsg = paramString2;
    this.yFW = paramBoolean;
  }

  private String aJ(bi parambi)
  {
    if (parambi.field_isSend == 1);
    for (parambi = this.fsg; ; parambi = this.talker)
      return parambi;
  }

  private CharSequence aK(bi parambi)
  {
    AppMethodBeat.i(30758);
    if (parambi.field_createTime == 9223372036854775807L)
    {
      parambi = "";
      AppMethodBeat.o(30758);
    }
    while (true)
    {
      return parambi;
      parambi = com.tencent.mm.pluginsdk.f.h.c(this.context, parambi.field_createTime, true);
      AppMethodBeat.o(30758);
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(30756);
    aw.ZK();
    setCursor(c.XO().fb(this.talker, this.mHZ));
    if ((this.yKp != null) && (!ah.isNullOrNil(this.mHZ)))
      this.yKp.Oo(getCount());
    super.notifyDataSetChanged();
    AppMethodBeat.o(30756);
  }

  public final void KD()
  {
    AppMethodBeat.i(30757);
    bIf();
    KC();
    AppMethodBeat.o(30757);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(30754);
    bi localbi;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130970566, null);
      paramViewGroup = new u.b((byte)0);
      paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131821183));
      paramViewGroup.ejp = ((TextView)paramView.findViewById(2131823149));
      paramViewGroup.jJT = ((TextView)paramView.findViewById(2131823150));
      paramViewGroup.yKq = ((TextView)paramView.findViewById(2131822913));
      paramView.setTag(paramViewGroup);
      localbi = (bi)getItem(paramInt);
      if (localbi != null)
      {
        if ((!this.yFW) || (localbi.field_isSend != 0))
          break label236;
        String str1 = localbi.field_content;
        String str2 = bf.oy(str1);
        if (!ah.isNullOrNil(str2))
        {
          a.b.b(paramViewGroup.ejo, str2);
          paramViewGroup.ejp.setText(j.b(this.context, s.mJ(str2), paramViewGroup.ejp.getTextSize()));
        }
        paramViewGroup.jJT.setText(aK(localbi));
        str2 = bf.oz(str1);
        paramViewGroup.yKq.setText(j.b(this.context, str2, paramViewGroup.yKq.getTextSize()));
      }
    }
    while (true)
    {
      AppMethodBeat.o(30754);
      return paramView;
      paramViewGroup = (u.b)paramView.getTag();
      break;
      label236: a.b.b(paramViewGroup.ejo, aJ(localbi));
      paramViewGroup.ejp.setText(j.b(this.context, s.mJ(aJ(localbi)), paramViewGroup.ejp.getTextSize()));
      paramViewGroup.jJT.setText(aK(localbi));
      paramViewGroup.yKq.setText(j.b(this.context, localbi.field_content, paramViewGroup.yKq.getTextSize()));
    }
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(30755);
    this.mHZ = paramString;
    if (!ah.isNullOrNil(this.mHZ))
    {
      bIf();
      KC();
    }
    AppMethodBeat.o(30755);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.u
 * JD-Core Version:    0.6.2
 */