package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzaaz extends zzaay<FieldDescriptorType, Object>
{
  zzaaz(int paramInt)
  {
    super(paramInt, null);
  }

  public final void zzrg()
  {
    AppMethodBeat.i(3388);
    if (!isImmutable())
    {
      Map.Entry localEntry;
      for (int i = 0; i < zzuj(); i++)
      {
        localEntry = zzah(i);
        if (((zzzo)localEntry.getKey()).zztk())
          localEntry.setValue(Collections.unmodifiableList((List)localEntry.getValue()));
      }
      Iterator localIterator = zzuk().iterator();
      while (localIterator.hasNext())
      {
        localEntry = (Map.Entry)localIterator.next();
        if (((zzzo)localEntry.getKey()).zztk())
          localEntry.setValue(Collections.unmodifiableList((List)localEntry.getValue()));
      }
    }
    super.zzrg();
    AppMethodBeat.o(3388);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaaz
 * JD-Core Version:    0.6.2
 */