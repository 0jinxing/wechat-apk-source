package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public abstract class h
  implements ab
{
  protected MMActivity jiE;
  protected g kqH;

  public h(g paramg, MMActivity paramMMActivity)
  {
    this.kqH = paramg;
    this.jiE = paramMMActivity;
  }

  public abstract boolean bet();

  public abstract boolean beu();

  public void c(ViewGroup paramViewGroup, b paramb)
  {
    Object localObject1;
    Object localObject2;
    if (bet())
    {
      localObject1 = (TextView)paramViewGroup.findViewById(2131821958);
      localObject2 = this.kqH.code;
      if ((!paramb.aZQ()) && ((bo.isNullOrNil((String)localObject2)) || (((String)localObject2).length() > 40)))
        break label299;
      ((TextView)localObject1).setText(m.Hu((String)localObject2));
      if (paramb.aZL())
      {
        ((TextView)localObject1).setVisibility(0);
        ((TextView)localObject1).setOnLongClickListener(new h.1(this, paramb));
        this.kqH.d(c.krI);
      }
    }
    else if (beu())
    {
      localObject1 = (LinearLayout)paramViewGroup.findViewById(2131821970);
      if ((paramb == null) || (paramb.aZV() == null) || (paramb.aZV().vUA == null) || (bo.isNullOrNil(paramb.aZV().vUA.title)))
        break label321;
      paramViewGroup.findViewById(2131821969).setVisibility(8);
      ((LinearLayout)localObject1).setVisibility(0);
      localObject2 = paramb.aZV().vUA;
      TextView localTextView = (TextView)paramViewGroup.findViewById(2131821971);
      localTextView.setText(((tm)localObject2).title);
      String str = paramb.aZV().color;
      if (!bo.isNullOrNil(str))
        localTextView.setTextColor(l.Hn(str));
      paramViewGroup = (TextView)paramViewGroup.findViewById(2131821972);
      localObject2 = ((tm)localObject2).kbX;
      if (TextUtils.isEmpty((CharSequence)localObject2))
        break label308;
      if (paramViewGroup != null)
      {
        paramViewGroup.setText((CharSequence)localObject2);
        paramViewGroup.setVisibility(0);
      }
      label276: ((LinearLayout)localObject1).setOnClickListener(new h.2(this, paramb));
    }
    while (true)
    {
      return;
      ((TextView)localObject1).setVisibility(8);
      break;
      label299: ((TextView)localObject1).setVisibility(8);
      break;
      label308: if (paramViewGroup == null)
        break label276;
      paramViewGroup.setVisibility(8);
      break label276;
      label321: ((LinearLayout)localObject1).setVisibility(8);
    }
  }

  public boolean g(b paramb)
  {
    return true;
  }

  public void l(ViewGroup paramViewGroup)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.h
 * JD-Core Version:    0.6.2
 */