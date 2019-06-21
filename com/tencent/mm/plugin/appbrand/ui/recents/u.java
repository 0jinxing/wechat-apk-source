package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.ViewGroup;

abstract class u<_Data, _ViewHolder extends RecyclerView.v>
{
  public abstract _ViewHolder a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup);

  public boolean b(_ViewHolder param_ViewHolder, Object paramObject)
  {
    return false;
  }

  public abstract long bA(_Data param_Data);

  public abstract void c(_ViewHolder param_ViewHolder, _Data param_Data);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.u
 * JD-Core Version:    0.6.2
 */