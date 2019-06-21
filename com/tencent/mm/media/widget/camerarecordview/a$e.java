package com.tencent.mm.media.widget.camerarecordview;

import a.l;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class a$e
  implements Runnable
{
  a$e(a parama, com.tencent.mm.media.i.a parama1, a.f.a.b paramb)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    AppMethodBeat.i(13232);
    Object localObject2 = new StringBuilder("stopRecord ");
    Object localObject3 = a.b(this.fbM);
    if (localObject3 != null)
    {
      localObject3 = ((com.tencent.mm.media.widget.b.b)localObject3).getFilePath();
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append(' ');
      localObject3 = a.b(this.fbM);
      if (localObject3 == null)
        break label176;
      localObject3 = ((com.tencent.mm.media.widget.b.b)localObject3).Wy();
      label67: d.c("MicroMsg.CameraPreviewContainer", (String)localObject3, new Object[0]);
      this.fbQ.SW();
      localObject3 = a.b(this.fbM);
      if (localObject3 == null)
        break label181;
      localObject3 = ((com.tencent.mm.media.widget.b.b)localObject3).getFilePath();
      label110: localObject2 = a.b(this.fbM);
      if (localObject2 != null)
        localObject1 = ((com.tencent.mm.media.widget.b.b)localObject2).Wy();
      if ((localObject3 == null) || (localObject1 == null))
        break label186;
      localObject1 = new com.tencent.mm.media.widget.camerarecordview.a.a((String)localObject3, (String)localObject1);
      localObject3 = this.exI;
      if (localObject3 == null)
        break label186;
      ((a.f.a.b)localObject3).am(localObject1);
      AppMethodBeat.o(13232);
    }
    while (true)
    {
      return;
      localObject3 = null;
      break;
      label176: localObject3 = null;
      break label67;
      label181: localObject3 = null;
      break label110;
      label186: AppMethodBeat.o(13232);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.a.e
 * JD-Core Version:    0.6.2
 */