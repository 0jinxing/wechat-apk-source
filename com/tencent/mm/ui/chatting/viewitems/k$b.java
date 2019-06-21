package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class k$b extends c.a
{
  public static Map<String, WeakReference<b>> zdR;
  ProgressBar pyf;
  ImageView zci;
  RTChattingEmojiView zdM;
  ImageView zdN;
  ProgressBar zdO;
  ImageView zdP;
  TextView zdQ;

  static
  {
    AppMethodBeat.i(32939);
    zdR = new HashMap();
    AppMethodBeat.o(32939);
  }

  public static void n(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32938);
    if (!zdR.containsKey(paramString))
    {
      ab.i("AppMsgEmojiItemHolder", "no contain attchid:%s");
      AppMethodBeat.o(32938);
      return;
    }
    paramString = (b)((WeakReference)zdR.get(paramString)).get();
    if (paramString != null)
      switch (paramInt2)
      {
      default:
      case 1:
      case 2:
      case 0:
      }
    while (true)
    {
      AppMethodBeat.o(32938);
      break;
      paramString.zdO.setVisibility(8);
      paramString.zdQ.setVisibility(8);
      paramString.zdP.setVisibility(8);
      AppMethodBeat.o(32938);
      break;
      paramString.zdO.setVisibility(8);
      paramString.zdQ.setVisibility(8);
      paramString.zdP.setVisibility(0);
      paramString.zdO.setProgress(paramInt1);
      paramString.zdP.setImageResource(2130838561);
      AppMethodBeat.o(32938);
      break;
      paramString.zdO.setVisibility(0);
      paramString.zdQ.setVisibility(8);
      paramString.zdP.setVisibility(8);
      paramString.zdO.setProgress(0);
    }
  }

  public final c.a z(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(32937);
    super.eP(paramView);
    this.enf = ((TextView)paramView.findViewById(2131820587));
    this.zdM = ((RTChattingEmojiView)paramView.findViewById(2131822578));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.zdO = ((ProgressBar)paramView.findViewById(2131822579));
    this.zdP = ((ImageView)paramView.findViewById(2131822581));
    this.zdQ = ((TextView)paramView.findViewById(2131822580));
    if (!paramBoolean)
    {
      this.pyf = ((ProgressBar)paramView.findViewById(2131822660));
      this.zby = ((ImageView)paramView.findViewById(2131822629));
      this.zci = ((ImageView)paramView.findViewById(2131822661));
    }
    if (this.zdN != null)
      ((ViewGroup)this.zdN.getParent()).setBackgroundDrawable(null);
    this.qkY = ((TextView)paramView.findViewById(2131821102));
    AppMethodBeat.o(32937);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.k.b
 * JD-Core Version:    0.6.2
 */