package com.google.android.gms.common.data;

import android.content.Context;

public abstract interface TextFilterable
{
  public static final TextFilterable.StringFilter CONTAINS = new zzc();
  public static final TextFilterable.StringFilter STARTS_WITH = new zzd();
  public static final TextFilterable.StringFilter WORD_STARTS_WITH = new zze();

  public abstract void setFilterTerm(Context paramContext, TextFilterable.StringFilter paramStringFilter, String paramString);

  public abstract void setFilterTerm(Context paramContext, String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.TextFilterable
 * JD-Core Version:    0.6.2
 */