package com.tencent.mm.ui.tools;

import android.widget.TextView.OnEditorActionListener;
import java.util.ArrayList;

public abstract interface d
{
  public abstract void dJr();

  public abstract boolean dJs();

  public abstract boolean dJt();

  public abstract String getSearchContent();

  public abstract void qN(boolean paramBoolean);

  public abstract void qO(boolean paramBoolean);

  public abstract void setAutoMatchKeywords(boolean paramBoolean);

  public abstract void setBackClickCallback(ActionBarSearchView.a parama);

  public abstract void setCallBack(ActionBarSearchView.b paramb);

  public abstract void setEditTextEnabled(boolean paramBoolean);

  public abstract void setHint(CharSequence paramCharSequence);

  public abstract void setKeywords(ArrayList<String> paramArrayList);

  public abstract void setNotRealCallBack(SearchViewNotRealTimeHelper.a parama);

  public abstract void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener);

  public abstract void setSearchContent(String paramString);

  public abstract void setSearchTipIcon(int paramInt);

  public abstract void setSelectedTag(String paramString);

  public abstract void setStatusBtnEnabled(boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.d
 * JD-Core Version:    0.6.2
 */