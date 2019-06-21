package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.n.c;
import com.tencent.mm.plugin.game.model.n.e;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public class GameMessageBubbleView extends LinearLayout
  implements View.OnClickListener
{
  private Context mContext;
  private boolean mHasInit = false;
  View nle;
  private TextView nlf;
  private ImageView nlg;
  private n nlh;
  private final long nli = 500L;
  private long nlj = 0L;

  public GameMessageBubbleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  public final void bFu()
  {
    AppMethodBeat.i(112085);
    ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
    this.nlh = q.bEq();
    if (this.nlh == null)
    {
      this.nle.setOnClickListener(null);
      setVisibility(8);
      AppMethodBeat.o(112085);
    }
    while (true)
    {
      return;
      this.nlh.bEl();
      if ((this.nlh.field_msgType == 100) && ((bo.isNullOrNil(this.nlh.mWt.eeO)) || (bo.isNullOrNil(this.nlh.mWt.mXj)) || (bo.isNullOrNil(this.nlh.mWt.mXk)) || (!this.nlh.mWu.containsKey(this.nlh.mWt.mXk))))
      {
        ab.w("MicroMsg.GameMessageHeaderView", "bubble is invalid");
        this.nle.setOnClickListener(null);
        setVisibility(8);
        AppMethodBeat.o(112085);
      }
      else
      {
        this.nlf.setText(this.nlh.mWt.eeO);
        com.tencent.mm.at.o.ahp().a(this.nlh.mWt.mXj, this.nlg);
        this.nle.setOnClickListener(this);
        setVisibility(0);
        AppMethodBeat.o(112085);
      }
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(112086);
    if (System.currentTimeMillis() - this.nlj <= 500L)
      AppMethodBeat.o(112086);
    int i;
    while (true)
    {
      return;
      if (this.nlh == null)
      {
        AppMethodBeat.o(112086);
      }
      else
      {
        ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
        q.bEr();
        if (this.nlh.field_msgType == 100)
        {
          if (!bo.isNullOrNil(this.nlh.mWt.mXk))
          {
            paramView = (n.e)this.nlh.mWu.get(this.nlh.mWt.mXk);
            if (paramView != null)
            {
              i = com.tencent.mm.plugin.game.model.o.a(this.mContext, this.nlh, paramView, this.nlh.field_appId, 1007);
              if (i != 0)
                com.tencent.mm.plugin.game.e.b.a(this.mContext, 10, 1007, 1, i, 0, this.nlh.field_appId, 0, this.nlh.mXb, this.nlh.field_gameMsgId, this.nlh.mXc, null);
              if (paramView.mXo != 4)
              {
                this.nlh.field_isRead = true;
                ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().c(this.nlh, new String[0]);
              }
            }
          }
          this.nlj = System.currentTimeMillis();
          AppMethodBeat.o(112086);
        }
        else
        {
          if ((this.nlh != null) && (this.nlh.mWw != 3))
          {
            this.nlh.field_isRead = true;
            ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().c(this.nlh, new String[0]);
          }
          switch (this.nlh.mWw)
          {
          default:
            ab.e("MicroMsg.GameMessageHeaderView", "unknown bubble_action = " + this.nlh.mWw);
            AppMethodBeat.o(112086);
          case 1:
          case 2:
          case 3:
          }
        }
      }
    }
    paramView = this.nlh.mWi;
    if (!bo.isNullOrNil(paramView))
      i = com.tencent.mm.plugin.game.f.c.t(this.mContext, paramView, "game_center_bubble");
    while (true)
    {
      com.tencent.mm.plugin.game.e.b.a(this.mContext, 10, 1007, 1, i, 0, this.nlh.field_appId, 0, this.nlh.field_msgType, this.nlh.field_gameMsgId, this.nlh.mXc, null);
      this.nlj = System.currentTimeMillis();
      AppMethodBeat.o(112086);
      break;
      if (!bo.isNullOrNil(this.nlh.field_appId))
      {
        paramView = new Bundle();
        paramView.putCharSequence("game_app_id", this.nlh.field_appId);
        paramView.putInt("game_report_from_scene", 1007);
        i = com.tencent.mm.plugin.game.f.c.b(this.mContext, this.nlh.field_appId, null, paramView);
      }
      else
      {
        ab.e("MicroMsg.GameMessageHeaderView", "message type : " + this.nlh.field_msgType + " ,message.field_appId is null.");
        i = 0;
        continue;
        paramView = new Intent(this.mContext, GameMessageUI.class);
        paramView.putExtra("game_report_from_scene", 1007);
        this.mContext.startActivity(paramView);
        i = 6;
        continue;
        i = 0;
      }
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112084);
    super.onFinishInflate();
    if (!this.mHasInit)
    {
      this.nlg = ((ImageView)findViewById(2131824335));
      this.nlf = ((TextView)findViewById(2131824336));
      this.nle = findViewById(2131824334);
      setVisibility(8);
      this.mHasInit = true;
    }
    AppMethodBeat.o(112084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageBubbleView
 * JD-Core Version:    0.6.2
 */