package com.tencent.mm.media.widget.camerarecordview;

import a.l;
import android.graphics.SurfaceTexture;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.a.e;
import com.tencent.mm.media.widget.camerarecordview.preview.c;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class a$d$1
  implements Runnable
{
  a$d$1(a.d paramd, SurfaceTexture paramSurfaceTexture)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(13230);
    a.d(this.fbO.fbM).a(this.fbP, this.fbO.fbM.fbK.WD(), this.fbO.fbM.fbK.getResolutionLimit());
    com.tencent.mm.media.widget.a.b localb = a.d(this.fbO.fbM).Wq();
    Object localObject;
    boolean bool;
    if (localb != null)
    {
      this.fbO.fbM.fbK.getCameraPreviewView().a(localb);
      a.e(this.fbO.fbM);
      a.f(this.fbO.fbM);
      localObject = a.g(this.fbO.fbM);
      if ((!this.fbO.fbN) && (this.fbO.fbM.fbK.WE()))
      {
        bool = true;
        ((com.tencent.mm.media.widget.camerarecordview.b.a)localObject).a(bool, localb);
      }
    }
    else
    {
      localObject = this.fbO.exI;
      if (localObject == null)
        break label213;
      ((a.f.a.b)localObject).am(Boolean.valueOf(a.d(this.fbO.fbM).Wh()));
      AppMethodBeat.o(13230);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label213: AppMethodBeat.o(13230);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.a.d.1
 * JD-Core Version:    0.6.2
 */