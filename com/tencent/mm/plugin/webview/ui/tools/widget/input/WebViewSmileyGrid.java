package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.cb.e;
import com.tencent.mm.ui.v;

public class WebViewSmileyGrid extends GridView
{
  AdapterView.OnItemClickListener arw;
  int jiA;
  int jiB;
  int jiw;
  int jix;
  int jiy;
  int jiz;
  a uKA;
  private c uKz;

  public WebViewSmileyGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(10108);
    this.jix = 0;
    this.jiz = 0;
    this.jiA = 0;
    this.jiB = 0;
    this.arw = new WebViewSmileyGrid.1(this);
    AppMethodBeat.o(10108);
  }

  int getRowSpacing()
  {
    return this.jiz;
  }

  public void setPanelManager(c paramc)
  {
    this.uKz = paramc;
  }

  final class a extends BaseAdapter
  {
    private a()
    {
    }

    public final int getCount()
    {
      AppMethodBeat.i(10105);
      int i = WebViewSmileyGrid.d(WebViewSmileyGrid.this);
      AppMethodBeat.o(10105);
      return i;
    }

    public final Object getItem(int paramInt)
    {
      return null;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(10106);
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = v.hu(WebViewSmileyGrid.this.getContext()).inflate(2130971218, null);
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, (WebViewSmileyGrid.b(WebViewSmileyGrid.this).jiL - a.al(WebViewSmileyGrid.this.getContext(), 2131427786) - a.al(WebViewSmileyGrid.this.getContext(), 2131428368)) / WebViewSmileyGrid.f(WebViewSmileyGrid.this)));
        paramViewGroup = new WebViewSmileyGrid.b(paramView);
        paramView.setTag(paramViewGroup);
        if (paramInt != getCount() - 1)
          break label161;
        paramViewGroup.iqT.setImageResource(2130838450);
        paramViewGroup.iqT.setContentDescription(WebViewSmileyGrid.this.getContext().getString(2131298865));
      }
      while (true)
      {
        AppMethodBeat.o(10106);
        return paramView;
        paramViewGroup = (WebViewSmileyGrid.b)paramView.getTag();
        break;
        label161: paramInt = (WebViewSmileyGrid.d(WebViewSmileyGrid.this) - 1) * WebViewSmileyGrid.c(WebViewSmileyGrid.this) + paramInt;
        if (paramInt > WebViewSmileyGrid.e(WebViewSmileyGrid.this) - 1)
        {
          paramViewGroup.iqT.setImageDrawable(null);
        }
        else
        {
          WebViewSmileyGrid.b(WebViewSmileyGrid.this);
          Drawable localDrawable = e.dqK().qJ(paramInt);
          paramViewGroup.iqT.setImageDrawable(localDrawable);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid
 * JD-Core Version:    0.6.2
 */