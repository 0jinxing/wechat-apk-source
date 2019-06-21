package com.google.android.gms.common.data;

public abstract interface ExclusionFilterable
{
  public abstract void clearFilters();

  public abstract void filterOut(String paramString);

  public abstract void unfilter(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.ExclusionFilterable
 * JD-Core Version:    0.6.2
 */