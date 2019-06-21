package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.LogInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

final class a extends RecyclerView.a
{
  private static final SimpleDateFormat jpD;
  List<LogInfo> jpE;
  LayoutInflater mInflater;

  static
  {
    AppMethodBeat.i(11131);
    jpD = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    AppMethodBeat.o(11131);
  }

  a(Context paramContext)
  {
    AppMethodBeat.i(11126);
    this.mInflater = LayoutInflater.from(paramContext);
    this.jpE = new LinkedList();
    AppMethodBeat.o(11126);
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(11127);
    paramViewGroup = new a.a(this.mInflater.inflate(2130969193, paramViewGroup, false), paramInt);
    AppMethodBeat.o(11127);
    return paramViewGroup;
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(11128);
    LogInfo localLogInfo = (LogInfo)this.jpE.get(paramInt);
    ((a.a)paramv).gKl.setText(String.format("[%s] %s", new Object[] { jpD.format(new Date(localLogInfo.ts)), localLogInfo.message }));
    AppMethodBeat.o(11128);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(11129);
    int i = this.jpE.size();
    AppMethodBeat.o(11129);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(11130);
    paramInt = ((LogInfo)this.jpE.get(paramInt)).level;
    AppMethodBeat.o(11130);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.a
 * JD-Core Version:    0.6.2
 */