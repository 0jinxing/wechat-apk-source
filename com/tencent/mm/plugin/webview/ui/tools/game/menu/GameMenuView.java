package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GameMenuView extends LinearLayout
{
  private Context mContext;
  private LayoutInflater mInflater;
  private boolean uEM;
  private View uER;
  private LinearLayout uES;
  private LinearLayout uET;
  private f uEU;
  private b.c uEV;
  private b.a uEW;

  public GameMenuView(Context paramContext)
  {
    super(paramContext, null);
    AppMethodBeat.i(8830);
    this.uEM = false;
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(this.mContext);
    paramContext = this.mContext.getResources().getDisplayMetrics();
    if (paramContext.widthPixels > paramContext.heightPixels)
      bool = true;
    this.uEM = bool;
    initView();
    AppMethodBeat.o(8830);
  }

  public GameMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(8832);
    this.uEM = false;
    this.mContext = paramContext;
    initView();
    AppMethodBeat.o(8832);
  }

  private void initView()
  {
    AppMethodBeat.i(8833);
    if (this.uEM)
    {
      setOrientation(0);
      this.mInflater.inflate(2130969752, this, true);
    }
    for (View localView = this.mInflater.inflate(2130969749, this, true); ; localView = this.mInflater.inflate(2130969750, this, true))
    {
      this.uER = localView.findViewById(2131824565);
      this.uES = ((LinearLayout)localView.findViewById(2131824566));
      this.uET = ((LinearLayout)localView.findViewById(2131824567));
      AppMethodBeat.o(8833);
      return;
      setOrientation(1);
      this.mInflater.inflate(2130969753, this, true);
    }
  }

  public void setAdapter(f paramf)
  {
    AppMethodBeat.i(8831);
    this.uEU = paramf;
    paramf.registerDataSetObserver(new GameMenuView.1(this));
    paramf.notifyDataSetChanged();
    AppMethodBeat.o(8831);
  }

  public void setDismissListener(b.a parama)
  {
    this.uEW = parama;
  }

  public void setGameMenuItemSelectedListener(b.c paramc)
  {
    this.uEV = paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView
 * JD-Core Version:    0.6.2
 */