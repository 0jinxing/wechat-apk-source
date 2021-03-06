package com.google.android.gms.common.data;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Locale;

public final class TextFilteredDataBuffer<T> extends FilteredDataBuffer<T>
  implements TextFilterable
{
  private final ArrayList<Integer> zzob;
  private AbstractDataBuffer<T> zzoc;
  private final String zzoo;
  private String zzop;
  private TextFilterable.StringFilter zzoq;
  private Locale zzor;

  public TextFilteredDataBuffer(AbstractDataBuffer<T> paramAbstractDataBuffer, String paramString)
  {
    super(paramAbstractDataBuffer);
    AppMethodBeat.i(61181);
    this.zzob = new ArrayList();
    this.zzoc = paramAbstractDataBuffer;
    this.zzoo = paramString;
    AppMethodBeat.o(61181);
  }

  private final String zzh(String paramString)
  {
    AppMethodBeat.i(61186);
    paramString = paramString.toLowerCase(this.zzor);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int j = paramString.length();
    while (i < j)
    {
      if (!Character.isIdentifierIgnorable(paramString.charAt(i)))
        localStringBuilder.append(paramString.charAt(i));
      i++;
    }
    paramString = localStringBuilder.toString();
    AppMethodBeat.o(61186);
    return paramString;
  }

  public final int computeRealPosition(int paramInt)
  {
    AppMethodBeat.i(61183);
    if (TextUtils.isEmpty(this.zzop))
      AppMethodBeat.o(61183);
    while (true)
    {
      return paramInt;
      if ((paramInt < 0) || (paramInt >= this.zzob.size()))
      {
        IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException(53 + "Position " + paramInt + " is out of bounds for this buffer");
        AppMethodBeat.o(61183);
        throw localIllegalArgumentException;
      }
      paramInt = ((Integer)this.zzob.get(paramInt)).intValue();
      AppMethodBeat.o(61183);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(61182);
    int i;
    if (TextUtils.isEmpty(this.zzop))
    {
      i = this.mDataBuffer.getCount();
      AppMethodBeat.o(61182);
    }
    while (true)
    {
      return i;
      i = this.zzob.size();
      AppMethodBeat.o(61182);
    }
  }

  public final void setFilterTerm(Context paramContext, TextFilterable.StringFilter paramStringFilter, String paramString)
  {
    AppMethodBeat.i(61185);
    Preconditions.checkNotNull(paramStringFilter);
    this.zzop = paramString;
    this.zzoq = paramStringFilter;
    if (!TextUtils.isEmpty(this.zzop))
    {
      this.zzor = paramContext.getResources().getConfiguration().locale;
      this.zzop = zzh(this.zzop);
      this.zzob.clear();
      paramString = this.zzoc.mDataHolder;
      paramContext = this.zzoo;
      boolean bool = this.zzoc instanceof EntityBuffer;
      int i = 0;
      int j = this.zzoc.getCount();
      if (i < j)
      {
        if (bool);
        for (int k = ((EntityBuffer)this.zzoc).zzi(i); ; k = i)
        {
          paramStringFilter = paramString.getString(paramContext, k, paramString.getWindowIndex(k));
          if ((!TextUtils.isEmpty(paramStringFilter)) && (this.zzoq.matches(zzh(paramStringFilter), this.zzop)))
            this.zzob.add(Integer.valueOf(i));
          i++;
          break;
        }
      }
      AppMethodBeat.o(61185);
    }
    while (true)
    {
      return;
      this.zzob.clear();
      AppMethodBeat.o(61185);
    }
  }

  @VisibleForTesting
  public final void setFilterTerm(Context paramContext, String paramString)
  {
    AppMethodBeat.i(61184);
    setFilterTerm(paramContext, CONTAINS, paramString);
    AppMethodBeat.o(61184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.TextFilteredDataBuffer
 * JD-Core Version:    0.6.2
 */