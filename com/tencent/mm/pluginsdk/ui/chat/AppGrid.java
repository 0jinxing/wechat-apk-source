package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import java.util.List;
import java.util.Map;

public class AppGrid extends GridView
{
  private Context context;
  private SharedPreferences ehZ;
  private AdapterView.OnItemClickListener jMk;
  private AdapterView.OnItemLongClickListener mkF;
  private int vlA;
  private AppGrid.a vlB;
  private AppGrid.b vlv;
  private int vlw;
  private int vlx;
  private int vly;
  private int vlz;

  public AppGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(27736);
    this.vlx = 0;
    this.vly = 0;
    this.jMk = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(27727);
        AppGrid.c(AppGrid.this).a(AppGrid.c(AppGrid.this).Lb(AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) + paramAnonymousInt), AppGrid.d(AppGrid.this).Fq(paramAnonymousInt));
        AppMethodBeat.o(27727);
      }
    };
    this.mkF = new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(27728);
        paramAnonymousAdapterView = AppGrid.c(AppGrid.this);
        int i = AppGrid.c(AppGrid.this).Lb(AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) + paramAnonymousInt);
        AppGrid.d(AppGrid.this).Fq(paramAnonymousInt);
        paramAnonymousAdapterView.Lc(i);
        AppMethodBeat.o(27728);
        return true;
      }
    };
    this.context = paramContext;
    AppMethodBeat.o(27736);
  }

  public AppGrid(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(27735);
    this.vlx = 0;
    this.vly = 0;
    this.jMk = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(27727);
        AppGrid.c(AppGrid.this).a(AppGrid.c(AppGrid.this).Lb(AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) + paramAnonymousInt), AppGrid.d(AppGrid.this).Fq(paramAnonymousInt));
        AppMethodBeat.o(27727);
      }
    };
    this.mkF = new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(27728);
        paramAnonymousAdapterView = AppGrid.c(AppGrid.this);
        int i = AppGrid.c(AppGrid.this).Lb(AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) + paramAnonymousInt);
        AppGrid.d(AppGrid.this).Fq(paramAnonymousInt);
        paramAnonymousAdapterView.Lc(i);
        AppMethodBeat.o(27728);
        return true;
      }
    };
    this.context = paramContext;
    AppMethodBeat.o(27735);
  }

  public final void La(int paramInt)
  {
    AppMethodBeat.i(27738);
    if (paramInt <= 0)
      AppMethodBeat.o(27738);
    while (true)
    {
      return;
      setPadding(BackwardSupportUtil.b.b(this.context, 16.0F), paramInt, BackwardSupportUtil.b.b(this.context, 16.0F), 0);
      setVerticalSpacing(paramInt / 2);
      AppMethodBeat.o(27738);
    }
  }

  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(27739);
    this.vlz = paramInt1;
    this.vlw = paramInt2;
    this.vlx = paramInt3;
    this.vly = paramInt4;
    this.vlA = paramInt6;
    setNumColumns(paramInt5);
    AppMethodBeat.o(27739);
  }

  public final void d(List<f> paramList, Map<String, f> paramMap)
  {
    AppMethodBeat.i(27737);
    this.vlB = new AppGrid.a(this, this.context, paramList, paramMap);
    setBackgroundResource(0);
    setAdapter(this.vlB);
    setOnItemClickListener(this.jMk);
    setOnItemLongClickListener(this.mkF);
    int i = BackwardSupportUtil.b.b(this.context, 16.0F);
    int j = BackwardSupportUtil.b.b(this.context, 16.0F);
    setPadding(i, BackwardSupportUtil.b.b(this.context, 6.0F), j, 0);
    AppMethodBeat.o(27737);
  }

  public int getCount()
  {
    AppMethodBeat.i(27740);
    int i = this.vlB.getCount();
    AppMethodBeat.o(27740);
    return i;
  }

  public void setOnAppSelectedListener(AppGrid.b paramb)
  {
    this.vlv = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppGrid
 * JD-Core Version:    0.6.2
 */