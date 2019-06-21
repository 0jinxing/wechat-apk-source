package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.ay;
import com.tencent.mm.ui.widget.MMTextView;
import com.tencent.mm.ui.widget.MMTextView.b;

public final class s$f
  implements MMTextView.b
{
  private View.OnTouchListener gAg;
  private o gKG;
  private ScrollView hJh;
  ak handler;
  private long pDz;
  boolean swe;
  private boolean swf;
  int urq;
  private a yJI;
  private MMTextView yJK;
  private TextView yJL;
  private final int yJM;
  private int yJN;
  private int yJO;

  public s$f(a parama)
  {
    AppMethodBeat.i(30722);
    this.yJI = null;
    this.gKG = null;
    this.yJK = null;
    this.yJL = null;
    this.hJh = null;
    this.pDz = 0L;
    this.yJM = 3;
    this.yJN = 0;
    this.urq = 0;
    this.yJO = 0;
    this.swe = false;
    this.swf = false;
    this.handler = new s.f.1(this);
    this.gAg = null;
    this.yJI = parama;
    AppMethodBeat.o(30722);
  }

  public final boolean eL(View paramView)
  {
    AppMethodBeat.i(30723);
    boolean bool;
    if ((paramView.getTag() instanceof ay))
    {
      Object localObject1 = (ay)paramView.getTag();
      if (((paramView instanceof TextView)) && (((ay)localObject1).cKd != null) && (this.yJI != null))
      {
        Object localObject2 = "";
        if ((paramView instanceof TextView))
          localObject2 = ((TextView)paramView).getText();
        paramView = this.yJI.yTx.getContext();
        localObject1 = ((ay)localObject1).cKd;
        Intent localIntent = new Intent(paramView, TextPreviewUI.class);
        localIntent.putExtra("key_chat_text", (CharSequence)localObject2);
        localIntent.putExtra("Chat_Msg_Id", ((cy)localObject1).field_msgId);
        paramView.startActivity(localIntent);
        b.hL(paramView);
        bool = true;
        AppMethodBeat.o(30723);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30723);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.f
 * JD-Core Version:    0.6.2
 */