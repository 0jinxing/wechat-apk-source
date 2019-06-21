package com.tencent.mm.media.editor.c;

import a.a.ab;
import a.l;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/touch/TouchTracker;", "", "()V", "TAG", "", "boundArrayDst", "", "getBoundArrayDst", "()[F", "setBoundArrayDst", "([F)V", "boundArrayOut", "getBoundArrayOut", "setBoundArrayOut", "boundArraySrc", "getBoundArraySrc", "setBoundArraySrc", "height", "", "getHeight", "()I", "setHeight", "(I)V", "holdX", "", "getHoldX", "()F", "setHoldX", "(F)V", "holdY", "getHoldY", "setHoldY", "holdingThreshold", "getHoldingThreshold", "setHoldingThreshold", "lastDrag", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "()Landroid/graphics/Matrix;", "setMatrix", "(Landroid/graphics/Matrix;)V", "maxScale", "getMaxScale", "setMaxScale", "minScale", "getMinScale", "setMinScale", "pIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "pIndices", "pivotDst", "pivotType", "Lcom/tencent/mm/media/editor/touch/TouchTracker$PivotType;", "safeAreaRect", "Landroid/graphics/Rect;", "getSafeAreaRect", "()Landroid/graphics/Rect;", "setSafeAreaRect", "(Landroid/graphics/Rect;)V", "state", "Lcom/tencent/mm/media/editor/touch/TouchTracker$TouchState;", "transStart", "transformBoundArray", "getTransformBoundArray", "setTransformBoundArray", "width", "getWidth", "setWidth", "appendTouchEvent", "", "event", "Landroid/view/MotionEvent;", "findIndices", "", "findMaxBottom", "findMaxRight", "findMinLeft", "findMinTop", "inSafeArea", "newLeft", "newTop", "newRight", "newBottom", "resetHold", "updateState", "PivotType", "TouchState", "plugin-mediaeditor_release"})
public final class c
{
  private final String TAG;
  public float aJf;
  public float aJg;
  public Matrix aKk;
  private ArrayList<Integer> eUH;
  private ArrayList<Integer> eUI;
  private float[] eUJ;
  private float[] eUK;
  private float[] eUL;
  private c.b eUM;
  public Rect eUN;
  public int eUO;
  private float eUP;
  private float eUQ;
  private float[] eUR;
  private float[] eUS;
  public float[] eUT;
  private float[] eUU;
  private a eUV;
  public int height;
  public int width;

  public c()
  {
    AppMethodBeat.i(12923);
    this.TAG = "TouchTracker";
    this.eUH = new ArrayList();
    this.eUI = new ArrayList();
    this.eUJ = new float[2];
    this.eUK = new float[4];
    this.eUL = new float[2];
    this.eUM = c.b.eUZ;
    this.aKk = new Matrix();
    this.eUR = new float[8];
    this.eUS = new float[8];
    this.eUT = new float[4];
    this.eUU = new float[4];
    this.aJf = 10.0F;
    this.aJg = 0.1F;
    this.eUV = a.eUW;
    this.aKk.setScale(1.0F, 1.0F);
    AppMethodBeat.o(12923);
  }

  private final float UK()
  {
    AppMethodBeat.i(12919);
    float f1 = this.eUS[0];
    float[] arrayOfFloat = this.eUS;
    int i = arrayOfFloat.length;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      float f2 = arrayOfFloat[j];
      float f3 = f1;
      switch (k)
      {
      default:
        f3 = f1;
      case 3:
      case 5:
      case 2:
      case 4:
      case 6:
      }
      while (true)
      {
        j++;
        k++;
        f1 = f3;
        break;
        f3 = Math.min(f1, f2);
        continue;
        f3 = Math.min(f1, f2);
        continue;
        f3 = Math.min(f1, f2);
      }
    }
    AppMethodBeat.o(12919);
    return f1;
  }

  private final float UL()
  {
    AppMethodBeat.i(12920);
    float f1 = this.eUS[1];
    float[] arrayOfFloat = this.eUS;
    int i = arrayOfFloat.length;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      float f2 = arrayOfFloat[j];
      float f3 = f1;
      switch (k)
      {
      default:
        f3 = f1;
      case 4:
      case 6:
      case 3:
      case 5:
      case 7:
      }
      while (true)
      {
        j++;
        k++;
        f1 = f3;
        break;
        f3 = Math.min(f1, f2);
        continue;
        f3 = Math.min(f1, f2);
        continue;
        f3 = Math.min(f1, f2);
      }
    }
    AppMethodBeat.o(12920);
    return f1;
  }

  private final float UM()
  {
    AppMethodBeat.i(12921);
    float f1 = this.eUS[0];
    float[] arrayOfFloat = this.eUS;
    int i = arrayOfFloat.length;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      float f2 = arrayOfFloat[j];
      float f3 = f1;
      switch (k)
      {
      default:
        f3 = f1;
      case 3:
      case 5:
      case 2:
      case 4:
      case 6:
      }
      while (true)
      {
        j++;
        k++;
        f1 = f3;
        break;
        f3 = Math.max(f1, f2);
        continue;
        f3 = Math.max(f1, f2);
        continue;
        f3 = Math.max(f1, f2);
      }
    }
    AppMethodBeat.o(12921);
    return f1;
  }

  private final float UN()
  {
    AppMethodBeat.i(12922);
    float f1 = this.eUS[1];
    float[] arrayOfFloat = this.eUS;
    int i = arrayOfFloat.length;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      float f2 = arrayOfFloat[j];
      float f3 = f1;
      switch (k)
      {
      default:
        f3 = f1;
      case 4:
      case 6:
      case 3:
      case 5:
      case 7:
      }
      while (true)
      {
        j++;
        k++;
        f1 = f3;
        break;
        f3 = Math.max(f1, f2);
        continue;
        f3 = Math.max(f1, f2);
        continue;
        f3 = Math.max(f1, f2);
      }
    }
    AppMethodBeat.o(12922);
    return f1;
  }

  private final void v(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(12917);
    Object localObject1;
    Object localObject2;
    if (this.eUH.size() == 1)
    {
      this.eUM = c.b.eVa;
      localObject1 = this.eUJ;
      localObject2 = this.eUI.get(0);
      a.f.b.j.o(localObject2, "pIndices[0]");
      localObject1[0] = paramMotionEvent.getX(((Number)localObject2).intValue());
      localObject2 = this.eUJ;
      localObject1 = this.eUI.get(0);
      a.f.b.j.o(localObject1, "pIndices[0]");
      localObject2[1] = paramMotionEvent.getY(((Number)localObject1).intValue());
      AppMethodBeat.o(12917);
    }
    while (true)
    {
      return;
      if (this.eUH.size() == 2)
      {
        this.eUM = c.b.eVb;
        if (this.eUV == a.eUX)
          this.aKk.mapPoints(this.eUL, new float[] { this.width / 2.0F, this.height / 2.0F });
        localObject1 = new Matrix();
        this.aKk.invert((Matrix)localObject1);
        w(paramMotionEvent);
        localObject2 = this.eUK;
        Object localObject3 = this.eUI.get(0);
        a.f.b.j.o(localObject3, "pIndices[0]");
        float f1 = paramMotionEvent.getX(((Number)localObject3).intValue());
        localObject3 = this.eUI.get(0);
        a.f.b.j.o(localObject3, "pIndices[0]");
        float f2 = paramMotionEvent.getY(((Number)localObject3).intValue());
        localObject3 = this.eUI.get(1);
        a.f.b.j.o(localObject3, "pIndices[1]");
        float f3 = paramMotionEvent.getX(((Number)localObject3).intValue());
        localObject3 = this.eUI.get(1);
        a.f.b.j.o(localObject3, "pIndices[1]");
        ((Matrix)localObject1).mapPoints((float[])localObject2, new float[] { f1, f2, f3, paramMotionEvent.getY(((Number)localObject3).intValue()) });
      }
      AppMethodBeat.o(12917);
    }
  }

  private final void w(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(12918);
    Iterator localIterator = ((Iterable)a.a.j.g((Collection)this.eUH)).iterator();
    while (localIterator.hasNext())
    {
      int i = ((ab)localIterator).nextInt();
      ArrayList localArrayList = this.eUI;
      Object localObject = this.eUH.get(i);
      a.f.b.j.o(localObject, "pIds[i]");
      localArrayList.set(i, Integer.valueOf(paramMotionEvent.findPointerIndex(((Number)localObject).intValue())));
    }
    AppMethodBeat.o(12918);
  }

  public final void h(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(12915);
    a.f.b.j.p(paramArrayOfFloat, "<set-?>");
    this.eUR = paramArrayOfFloat;
    AppMethodBeat.o(12915);
  }

  public final void setMatrix(Matrix paramMatrix)
  {
    AppMethodBeat.i(12914);
    a.f.b.j.p(paramMatrix, "<set-?>");
    this.aKk = paramMatrix;
    AppMethodBeat.o(12914);
  }

  public final boolean u(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(12916);
    a.f.b.j.p(paramMotionEvent, "event");
    switch (paramMotionEvent.getActionMasked())
    {
    case 4:
    default:
    case 0:
    case 5:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    while (true)
    {
      boolean bool = true;
      AppMethodBeat.o(12916);
      Object localObject2;
      while (true)
      {
        return bool;
        localObject1 = new float[2];
        localObject2 = new Matrix();
        this.aKk.invert((Matrix)localObject2);
        ((Matrix)localObject2).mapPoints((float[])localObject1, new float[] { paramMotionEvent.getX(), paramMotionEvent.getY() });
        if ((localObject1[0] >= 0.0F) && (localObject1[0] <= this.width) && (localObject1[1] >= 0.0F) && (localObject1[1] <= this.height))
          break;
        bool = false;
        AppMethodBeat.o(12916);
      }
      this.eUH.add(Integer.valueOf(paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex())));
      this.eUI.add(Integer.valueOf(paramMotionEvent.getActionIndex()));
      v(paramMotionEvent);
      continue;
      this.eUH.add(Integer.valueOf(paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex())));
      this.eUI.add(Integer.valueOf(paramMotionEvent.getActionIndex()));
      v(paramMotionEvent);
      continue;
      w(paramMotionEvent);
      if (paramMotionEvent.getPointerCount() == 1)
        this.eUM = c.b.eVa;
      Object localObject1 = this.eUM;
      float f2;
      float f3;
      float f4;
      int i;
      switch (d.eQZ[localObject1.ordinal()])
      {
      default:
        break;
      case 1:
        localObject1 = this.eUI.get(0);
        a.f.b.j.o(localObject1, "pIndices[0]");
        float f1 = paramMotionEvent.getX(((Number)localObject1).intValue());
        localObject1 = this.eUI.get(0);
        a.f.b.j.o(localObject1, "pIndices[0]");
        f2 = paramMotionEvent.getY(((Number)localObject1).intValue());
        f3 = f1 - this.eUJ[0];
        f4 = f2 - this.eUJ[1];
        this.aKk.postTranslate(f3, f4);
        this.eUJ[0] = f1;
        this.eUJ[1] = f2;
        this.aKk.mapPoints(this.eUS, this.eUR);
        this.eUT[0] = UK();
        this.eUT[1] = UL();
        this.eUT[2] = UM();
        this.eUT[3] = UN();
        if (this.eUN != null)
        {
          float f5 = this.eUT[0] + f3;
          f1 = this.eUT[1] + f4;
          float f6 = this.eUT[2] + f3;
          f2 = this.eUT[3] + f4;
          paramMotionEvent = this.eUN;
          if (paramMotionEvent == null)
            a.f.b.j.dWJ();
          if (f5 > paramMotionEvent.left)
          {
            paramMotionEvent = this.eUN;
            if (paramMotionEvent == null)
              a.f.b.j.dWJ();
            if (f5 < paramMotionEvent.right)
            {
              paramMotionEvent = this.eUN;
              if (paramMotionEvent == null)
                a.f.b.j.dWJ();
              if (f1 > paramMotionEvent.top)
              {
                paramMotionEvent = this.eUN;
                if (paramMotionEvent == null)
                  a.f.b.j.dWJ();
                if (f1 < paramMotionEvent.bottom)
                {
                  paramMotionEvent = this.eUN;
                  if (paramMotionEvent == null)
                    a.f.b.j.dWJ();
                  if (f6 > paramMotionEvent.left)
                  {
                    paramMotionEvent = this.eUN;
                    if (paramMotionEvent == null)
                      a.f.b.j.dWJ();
                    if (f6 < paramMotionEvent.right)
                    {
                      paramMotionEvent = this.eUN;
                      if (paramMotionEvent == null)
                        a.f.b.j.dWJ();
                      if (f2 > paramMotionEvent.top)
                      {
                        paramMotionEvent = this.eUN;
                        if (paramMotionEvent == null)
                          a.f.b.j.dWJ();
                        if (f2 >= paramMotionEvent.bottom);
                      }
                    }
                  }
                }
              }
            }
          }
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label1082;
            f3 = Math.abs(f3);
            f4 = Math.abs(f4);
            paramMotionEvent = this.eUN;
            if (paramMotionEvent == null)
              a.f.b.j.dWJ();
            if ((paramMotionEvent.left >= this.eUT[0]) && (this.eUP <= this.eUO))
            {
              localObject1 = this.aKk;
              paramMotionEvent = this.eUN;
              if (paramMotionEvent == null)
                a.f.b.j.dWJ();
              ((Matrix)localObject1).postTranslate(paramMotionEvent.left - this.eUT[0], 0.0F);
              this.eUP += f3;
            }
            paramMotionEvent = this.eUN;
            if (paramMotionEvent == null)
              a.f.b.j.dWJ();
            if ((paramMotionEvent.top >= this.eUT[1]) && (this.eUQ <= this.eUO))
            {
              localObject1 = this.aKk;
              paramMotionEvent = this.eUN;
              if (paramMotionEvent == null)
                a.f.b.j.dWJ();
              ((Matrix)localObject1).postTranslate(0.0F, paramMotionEvent.top - this.eUT[1]);
              this.eUQ += f4;
            }
            paramMotionEvent = this.eUN;
            if (paramMotionEvent == null)
              a.f.b.j.dWJ();
            if ((paramMotionEvent.right <= this.eUT[2]) && (this.eUP <= this.eUO))
            {
              paramMotionEvent = this.aKk;
              localObject1 = this.eUN;
              if (localObject1 == null)
                a.f.b.j.dWJ();
              paramMotionEvent.postTranslate(((Rect)localObject1).right - this.eUT[2], 0.0F);
              this.eUP = (f3 + this.eUP);
            }
            paramMotionEvent = this.eUN;
            if (paramMotionEvent == null)
              a.f.b.j.dWJ();
            if ((paramMotionEvent.bottom > this.eUT[3]) || (this.eUQ > this.eUO))
              break;
            paramMotionEvent = this.aKk;
            localObject1 = this.eUN;
            if (localObject1 == null)
              a.f.b.j.dWJ();
            paramMotionEvent.postTranslate(0.0F, ((Rect)localObject1).bottom - this.eUT[3]);
            this.eUQ += f4;
            break;
          }
        }
        this.eUP = 0.0F;
        this.eUQ = 0.0F;
        break;
      case 2:
        label1082: localObject1 = this.aKk;
        localObject2 = this.eUK;
        Object localObject3 = this.eUI.get(0);
        a.f.b.j.o(localObject3, "pIndices[0]");
        f2 = paramMotionEvent.getX(((Number)localObject3).intValue());
        localObject3 = this.eUI.get(0);
        a.f.b.j.o(localObject3, "pIndices[0]");
        f4 = paramMotionEvent.getY(((Number)localObject3).intValue());
        localObject3 = this.eUI.get(1);
        a.f.b.j.o(localObject3, "pIndices[1]");
        f3 = paramMotionEvent.getX(((Number)localObject3).intValue());
        localObject3 = this.eUI.get(1);
        a.f.b.j.o(localObject3, "pIndices[1]");
        ((Matrix)localObject1).setPolyToPoly((float[])localObject2, 0, new float[] { f2, f4, f3, paramMotionEvent.getY(((Number)localObject3).intValue()) }, 0, 2);
        if (this.eUV == a.eUX)
        {
          localObject1 = new float[2];
          this.aKk.mapPoints((float[])localObject1, new float[] { this.width / 2.0F, this.height / 2.0F });
          this.aKk.postTranslate(this.eUL[0] - localObject1[0], this.eUL[1] - localObject1[1]);
        }
        localObject1 = new float[2];
        localObject2 = this.eUI.get(0);
        a.f.b.j.o(localObject2, "pIndices[0]");
        f4 = paramMotionEvent.getX(((Number)localObject2).intValue());
        localObject2 = this.eUI.get(1);
        a.f.b.j.o(localObject2, "pIndices[1]");
        localObject1[0] = ((paramMotionEvent.getX(((Number)localObject2).intValue()) + f4) / 2.0F);
        localObject2 = this.eUI.get(0);
        a.f.b.j.o(localObject2, "pIndices[0]");
        f4 = paramMotionEvent.getY(((Number)localObject2).intValue());
        localObject2 = this.eUI.get(1);
        a.f.b.j.o(localObject2, "pIndices[1]");
        localObject1[1] = ((paramMotionEvent.getY(((Number)localObject2).intValue()) + f4) / 2.0F);
        paramMotionEvent = b.eUG;
        paramMotionEvent = this.aKk;
        f4 = this.aJg;
        f3 = this.aJf;
        a.f.b.j.p(paramMotionEvent, "matrix");
        a.f.b.j.p(localObject1, "pivotSrc");
        a.f.b.j.p(paramMotionEvent, "matrix");
        localObject2 = new float[9];
        paramMotionEvent.getValues((float[])localObject2);
        double d1 = localObject2[0];
        double d2 = localObject2[3];
        f2 = (float)Math.sqrt(d2 * d2 + d1 * d1);
        if (f2 < f4);
        while (true)
        {
          localObject3 = new Matrix();
          paramMotionEvent.invert((Matrix)localObject3);
          localObject2 = new float[2];
          ((Matrix)localObject3).mapPoints((float[])localObject2, (float[])localObject1);
          localObject3 = new float[9];
          paramMotionEvent.getValues((float[])localObject3);
          double d3 = localObject3[0];
          d1 = localObject3[3];
          d2 = localObject3[4];
          Math.sqrt(d3 * d3 + d1 * d1);
          f3 = (float)Math.round(Math.atan2(d1, d2) * 57.295779513082323D);
          paramMotionEvent.setTranslate(-localObject2[0], -localObject2[1]);
          paramMotionEvent.postScale(f4, f4);
          paramMotionEvent.postRotate(f3);
          paramMotionEvent.postTranslate(localObject1[0], localObject1[1]);
          do
          {
            this.aKk.mapPoints(this.eUS, this.eUR);
            this.eUT[0] = UK();
            this.eUT[1] = UL();
            this.eUT[2] = UM();
            this.eUT[3] = UN();
            break;
          }
          while (f2 <= f3);
          f4 = f3;
        }
        w(paramMotionEvent);
        i = this.eUI.indexOf(Integer.valueOf(paramMotionEvent.getActionIndex()));
        this.eUI.remove(i);
        this.eUH.remove(i);
        v(paramMotionEvent);
        continue;
        this.eUM = c.b.eUZ;
        this.eUH.clear();
        this.eUI.clear();
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/touch/TouchTracker$PivotType;", "", "(Ljava/lang/String;I)V", "FREE", "CENTER", "plugin-mediaeditor_release"})
  public static enum a
  {
    static
    {
      AppMethodBeat.i(12907);
      a locala1 = new a("FREE", 0);
      eUW = locala1;
      a locala2 = new a("CENTER", 1);
      eUX = locala2;
      eUY = new a[] { locala1, locala2 };
      AppMethodBeat.o(12907);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.c.c
 * JD-Core Version:    0.6.2
 */