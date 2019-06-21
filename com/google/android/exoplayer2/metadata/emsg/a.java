package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class a
  implements com.google.android.exoplayer2.metadata.a
{
  public final Metadata a(d paramd)
  {
    AppMethodBeat.i(95273);
    Object localObject = paramd.aEY;
    paramd = ((ByteBuffer)localObject).array();
    int i = ((ByteBuffer)localObject).limit();
    localObject = new l(paramd, i);
    String str1 = ((l)localObject).tL();
    String str2 = ((l)localObject).tL();
    long l = ((l)localObject).cM();
    ((l)localObject).eM(4);
    paramd = new Metadata(new Metadata.Entry[] { new EventMessage(str1, str2, ((l)localObject).cM() * 1000L / l, ((l)localObject).cM(), Arrays.copyOfRange(paramd, ((l)localObject).position, i)) });
    AppMethodBeat.o(95273);
    return paramd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.emsg.a
 * JD-Core Version:    0.6.2
 */