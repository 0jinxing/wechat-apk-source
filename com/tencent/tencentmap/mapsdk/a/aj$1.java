package com.tencent.tencentmap.mapsdk.a;

import android.location.Location;
import com.tencent.matrix.trace.core.AppMethodBeat;

class aj$1
  implements bi.a
{
  aj$1(aj paramaj)
  {
  }

  public void a()
  {
    AppMethodBeat.i(98311);
    this.a.c(true);
    Object localObject = this.a.k();
    if (localObject != null)
    {
      localObject = new db(((Location)localObject).getLatitude(), ((Location)localObject).getLongitude());
      this.a.b(ae.a((db)localObject));
    }
    AppMethodBeat.o(98311);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.aj.1
 * JD-Core Version:    0.6.2
 */