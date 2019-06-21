package com.tencent.mm.plugin.facedetect.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.InvalidParameterException;

final class FaceTutorial$b extends l
{
  public FaceTutorial$b(FaceTutorial paramFaceTutorial, i parami)
  {
    super(parami);
  }

  public final int getCount()
  {
    return 1;
  }

  public final Fragment getItem(int paramInt)
  {
    AppMethodBeat.i(520);
    switch (paramInt)
    {
    default:
      localObject = new InvalidParameterException("hy: invalid page status");
      AppMethodBeat.o(520);
      throw ((Throwable)localObject);
    case 0:
    }
    Object localObject = new FaceTutorial.TutorialOne(this.lYr);
    AppMethodBeat.o(520);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceTutorial.b
 * JD-Core Version:    0.6.2
 */