package com.tencent.mm.memory.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f.b;
import com.tencent.mm.a.f.c;
import com.tencent.mm.memory.a.a.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a
  implements c<String>
{
  String feb;
  WeakReference<f.b> fec;
  WeakReference<f.c> fed;
  public int fee;
  long fef;
  String feg;
  public String key;
  Object object;

  public a(String paramString1, String paramString2, Object paramObject, int paramInt, f.b paramb, f.c paramc)
  {
    AppMethodBeat.i(115444);
    this.fee = 0;
    this.fef = 0L;
    this.key = paramString1;
    this.feb = paramString2;
    this.object = paramObject;
    this.fee = paramInt;
    this.fec = new WeakReference(paramb);
    this.fed = new WeakReference(paramc);
    this.fef = System.currentTimeMillis();
    this.feg = new SimpleDateFormat("HH:mm:ss").format(new Date(this.fef));
    if (com.tencent.mm.memory.a.a.a.a.feq)
      ab.i("MicroMsg.BusinessBitmap", "BusinessBitmap build key %s sizes: %s cacheTime %s object %s stack [%s]", new Object[] { paramString1, bo.ga(paramInt), this.feg, paramObject, bo.dpG().toString() });
    AppMethodBeat.o(115444);
  }

  public boolean equals(Object paramObject)
  {
    AppMethodBeat.i(115446);
    boolean bool;
    if ((paramObject != null) && ((paramObject instanceof a)) && (((a)paramObject).object != null))
    {
      bool = ((a)paramObject).object.equals(this.object);
      AppMethodBeat.o(115446);
    }
    while (true)
    {
      return bool;
      bool = super.equals(paramObject);
      AppMethodBeat.o(115446);
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(115445);
    int i;
    if (this.object != null)
    {
      i = this.object.hashCode();
      AppMethodBeat.o(115445);
    }
    while (true)
    {
      return i;
      i = super.hashCode();
      AppMethodBeat.o(115445);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(115447);
    String str = String.format("StructBitmap %s key:%s size %s realObj %s cacheTime %s now %s", new Object[] { Integer.valueOf(hashCode()), this.key, bo.ga(this.fee), this.object, this.feg, new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis())) });
    AppMethodBeat.o(115447);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.a.a.a
 * JD-Core Version:    0.6.2
 */