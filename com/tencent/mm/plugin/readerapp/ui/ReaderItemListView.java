package com.tencent.mm.plugin.readerapp.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bl;
import com.tencent.mm.plugin.readerapp.b.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.d;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public class ReaderItemListView extends ListView
{
  private Context context;
  private LayoutInflater ezi;
  n.d jOb;
  List<bl> pFA;
  ReaderItemListView.a pFB;
  View.OnCreateContextMenuListener pFC;
  private DisplayMetrics pFD;
  int position;
  int type;

  public ReaderItemListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(76864);
    this.position = 0;
    this.type = 0;
    this.pFA = new ArrayList();
    init(paramContext);
    AppMethodBeat.o(76864);
  }

  public ReaderItemListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(76863);
    this.position = 0;
    this.type = 0;
    this.pFA = new ArrayList();
    init(paramContext);
    AppMethodBeat.o(76863);
  }

  private void init(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(76865);
    this.context = paramContext;
    this.ezi = v.hu(paramContext);
    this.type = ((Activity)paramContext).getIntent().getIntExtra("type", 0);
    if (bl.kG(this.type) != null)
      bool = true;
    Assert.assertTrue(bool);
    this.pFD = getResources().getDisplayMetrics();
    this.pFB = new ReaderItemListView.a(this);
    setAdapter(this.pFB);
    AppMethodBeat.o(76865);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76866);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, -2147483648));
    AppMethodBeat.o(76866);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderItemListView
 * JD-Core Version:    0.6.2
 */