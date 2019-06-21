package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class a
{
  private static final int[] eK = { 0, 4, 8 };
  private static SparseIntArray eM;
  HashMap<Integer, a.a> eL = new HashMap();

  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    eM = localSparseIntArray;
    localSparseIntArray.append(55, 25);
    eM.append(56, 26);
    eM.append(58, 29);
    eM.append(59, 30);
    eM.append(64, 36);
    eM.append(63, 35);
    eM.append(37, 4);
    eM.append(36, 3);
    eM.append(34, 1);
    eM.append(72, 6);
    eM.append(73, 7);
    eM.append(44, 17);
    eM.append(45, 18);
    eM.append(46, 19);
    eM.append(0, 27);
    eM.append(60, 32);
    eM.append(61, 33);
    eM.append(43, 10);
    eM.append(42, 9);
    eM.append(76, 13);
    eM.append(79, 16);
    eM.append(77, 14);
    eM.append(74, 11);
    eM.append(78, 15);
    eM.append(75, 12);
    eM.append(67, 40);
    eM.append(53, 39);
    eM.append(52, 41);
    eM.append(66, 42);
    eM.append(51, 20);
    eM.append(65, 37);
    eM.append(41, 5);
    eM.append(54, 75);
    eM.append(62, 75);
    eM.append(57, 75);
    eM.append(35, 75);
    eM.append(33, 75);
    eM.append(5, 24);
    eM.append(7, 28);
    eM.append(23, 31);
    eM.append(24, 8);
    eM.append(6, 34);
    eM.append(8, 2);
    eM.append(3, 23);
    eM.append(4, 21);
    eM.append(2, 22);
    eM.append(13, 43);
    eM.append(26, 44);
    eM.append(21, 45);
    eM.append(22, 46);
    eM.append(20, 60);
    eM.append(18, 47);
    eM.append(19, 48);
    eM.append(14, 49);
    eM.append(15, 50);
    eM.append(16, 51);
    eM.append(17, 52);
    eM.append(25, 53);
    eM.append(68, 54);
    eM.append(47, 55);
    eM.append(69, 56);
    eM.append(48, 57);
    eM.append(70, 58);
    eM.append(49, 59);
    eM.append(38, 61);
    eM.append(40, 62);
    eM.append(39, 63);
    eM.append(1, 38);
    eM.append(71, 69);
    eM.append(50, 70);
    eM.append(29, 71);
    eM.append(28, 72);
    eM.append(30, 73);
    eM.append(27, 74);
  }

  private static int a(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    int i = paramTypedArray.getResourceId(paramInt1, paramInt2);
    paramInt2 = i;
    if (i == -1)
      paramInt2 = paramTypedArray.getInt(paramInt1, -1);
    return paramInt2;
  }

  static void a(a.a parama, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    int j = 0;
    if (j < i)
    {
      int k = paramTypedArray.getIndex(j);
      switch (eM.get(k))
      {
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 59:
      case 64:
      case 65:
      case 66:
      case 67:
      case 68:
      default:
        new StringBuilder("Unknown attribute 0x").append(Integer.toHexString(k)).append("   ").append(eM.get(k));
      case 71:
      case 25:
      case 26:
      case 29:
      case 30:
      case 36:
      case 35:
      case 4:
      case 3:
      case 1:
      case 6:
      case 7:
      case 17:
      case 18:
      case 19:
      case 27:
      case 32:
      case 33:
      case 10:
      case 9:
      case 61:
      case 62:
      case 63:
      case 13:
      case 16:
      case 14:
      case 11:
      case 15:
      case 12:
      case 20:
      case 37:
      case 24:
      case 28:
      case 31:
      case 8:
      case 34:
      case 2:
      case 23:
      case 21:
      case 22:
      case 43:
      case 44:
      case 60:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 40:
      case 39:
      case 42:
      case 41:
      case 38:
      case 5:
      case 69:
      case 70:
      case 72:
      case 73:
      case 74:
      case 75:
      }
      while (true)
      {
        j++;
        break;
        parama.dB = a(paramTypedArray, k, parama.dB);
        continue;
        parama.dC = a(paramTypedArray, k, parama.dC);
        continue;
        parama.dD = a(paramTypedArray, k, parama.dD);
        continue;
        parama.dE = a(paramTypedArray, k, parama.dE);
        continue;
        parama.dF = a(paramTypedArray, k, parama.dF);
        continue;
        parama.dG = a(paramTypedArray, k, parama.dG);
        continue;
        parama.dH = a(paramTypedArray, k, parama.dH);
        continue;
        parama.dI = a(paramTypedArray, k, parama.dI);
        continue;
        parama.dJ = a(paramTypedArray, k, parama.dJ);
        continue;
        parama.em = paramTypedArray.getDimensionPixelOffset(k, parama.em);
        continue;
        parama.eo = paramTypedArray.getDimensionPixelOffset(k, parama.eo);
        continue;
        parama.dw = paramTypedArray.getDimensionPixelOffset(k, parama.dw);
        continue;
        parama.dz = paramTypedArray.getDimensionPixelOffset(k, parama.dz);
        continue;
        parama.dA = paramTypedArray.getFloat(k, parama.dA);
        continue;
        parama.orientation = paramTypedArray.getInt(k, parama.orientation);
        continue;
        parama.dN = a(paramTypedArray, k, parama.dN);
        continue;
        parama.dO = a(paramTypedArray, k, parama.dO);
        continue;
        parama.dP = a(paramTypedArray, k, parama.dP);
        continue;
        parama.dQ = a(paramTypedArray, k, parama.dQ);
        continue;
        parama.dK = a(paramTypedArray, k, parama.dK);
        continue;
        parama.dL = paramTypedArray.getDimensionPixelSize(k, parama.dL);
        continue;
        parama.dM = paramTypedArray.getFloat(k, parama.dM);
        continue;
        parama.dR = paramTypedArray.getDimensionPixelSize(k, parama.dR);
        continue;
        parama.dS = paramTypedArray.getDimensionPixelSize(k, parama.dS);
        continue;
        parama.dT = paramTypedArray.getDimensionPixelSize(k, parama.dT);
        continue;
        parama.dU = paramTypedArray.getDimensionPixelSize(k, parama.dU);
        continue;
        parama.dV = paramTypedArray.getDimensionPixelSize(k, parama.dV);
        continue;
        parama.dW = paramTypedArray.getDimensionPixelSize(k, parama.dW);
        continue;
        parama.dX = paramTypedArray.getFloat(k, parama.dX);
        continue;
        parama.dY = paramTypedArray.getFloat(k, parama.dY);
        continue;
        parama.leftMargin = paramTypedArray.getDimensionPixelSize(k, parama.leftMargin);
        continue;
        parama.rightMargin = paramTypedArray.getDimensionPixelSize(k, parama.rightMargin);
        continue;
        parama.eQ = paramTypedArray.getDimensionPixelSize(k, parama.eQ);
        continue;
        parama.eP = paramTypedArray.getDimensionPixelSize(k, parama.eP);
        continue;
        parama.topMargin = paramTypedArray.getDimensionPixelSize(k, parama.topMargin);
        continue;
        parama.bottomMargin = paramTypedArray.getDimensionPixelSize(k, parama.bottomMargin);
        continue;
        parama.mWidth = paramTypedArray.getLayoutDimension(k, parama.mWidth);
        continue;
        parama.mHeight = paramTypedArray.getLayoutDimension(k, parama.mHeight);
        continue;
        parama.visibility = paramTypedArray.getInt(k, parama.visibility);
        parama.visibility = eK[parama.visibility];
        continue;
        parama.alpha = paramTypedArray.getFloat(k, parama.alpha);
        continue;
        parama.eR = true;
        parama.eS = paramTypedArray.getDimension(k, parama.eS);
        continue;
        parama.rotation = paramTypedArray.getFloat(k, parama.rotation);
        continue;
        parama.eT = paramTypedArray.getFloat(k, parama.eT);
        continue;
        parama.eU = paramTypedArray.getFloat(k, parama.eU);
        continue;
        parama.scaleX = paramTypedArray.getFloat(k, parama.scaleX);
        continue;
        parama.scaleY = paramTypedArray.getFloat(k, parama.scaleY);
        continue;
        parama.eV = paramTypedArray.getFloat(k, parama.eV);
        continue;
        parama.eW = paramTypedArray.getFloat(k, parama.eW);
        continue;
        parama.eX = paramTypedArray.getDimension(k, parama.eX);
        continue;
        parama.eY = paramTypedArray.getDimension(k, parama.eY);
        continue;
        parama.eZ = paramTypedArray.getDimension(k, parama.eZ);
        continue;
        parama.verticalWeight = paramTypedArray.getFloat(k, parama.verticalWeight);
        continue;
        parama.horizontalWeight = paramTypedArray.getFloat(k, parama.horizontalWeight);
        continue;
        parama.ed = paramTypedArray.getInt(k, parama.ed);
        continue;
        parama.ec = paramTypedArray.getInt(k, parama.ec);
        continue;
        parama.eO = paramTypedArray.getResourceId(k, parama.eO);
        continue;
        parama.dZ = paramTypedArray.getString(k);
        continue;
        parama.fh = paramTypedArray.getFloat(k, 1.0F);
        continue;
        parama.fi = paramTypedArray.getFloat(k, 1.0F);
        continue;
        parama.fk = paramTypedArray.getInt(k, parama.fk);
        continue;
        parama.fo = paramTypedArray.getString(k);
        continue;
        parama.fj = paramTypedArray.getBoolean(k, parama.fj);
        continue;
        new StringBuilder("unused attribute 0x").append(Integer.toHexString(k)).append("   ").append(eM.get(k));
      }
    }
  }

  private static int[] a(View paramView, String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    Context localContext = paramView.getContext();
    paramString = new int[arrayOfString.length];
    int i = 0;
    int j = 0;
    String str;
    if (i < arrayOfString.length)
      str = arrayOfString[i].trim();
    while (true)
    {
      int m;
      try
      {
        k = R.id.class.getField(str).getInt(null);
        m = k;
        if (k == 0)
          m = localContext.getResources().getIdentifier(str, "id", localContext.getPackageName());
        if ((m != 0) || (!paramView.isInEditMode()) || (!(paramView.getParent() instanceof ConstraintLayout)))
          break label184;
        Object localObject = ((ConstraintLayout)paramView.getParent()).f(str);
        if ((localObject == null) || (!(localObject instanceof Integer)))
          break label184;
        k = ((Integer)localObject).intValue();
        paramString[j] = k;
        i++;
        j++;
      }
      catch (Exception localException)
      {
        k = 0;
        continue;
      }
      if (j != arrayOfString.length);
      for (paramView = Arrays.copyOf(paramString, j); ; paramView = paramString)
        return paramView;
      label184: int k = m;
    }
  }

  final void b(ConstraintLayout paramConstraintLayout)
  {
    int i = paramConstraintLayout.getChildCount();
    Object localObject1 = new HashSet(this.eL.keySet());
    int j = 0;
    Object localObject2;
    Object localObject4;
    if (j < i)
    {
      localObject2 = paramConstraintLayout.getChildAt(j);
      int k = ((View)localObject2).getId();
      if (k == -1)
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      if (this.eL.containsKey(Integer.valueOf(k)))
      {
        ((HashSet)localObject1).remove(Integer.valueOf(k));
        localObject3 = (a.a)this.eL.get(Integer.valueOf(k));
        if ((localObject2 instanceof Barrier))
          ((a.a)localObject3).fl = 1;
        if (((a.a)localObject3).fl != -1)
          switch (((a.a)localObject3).fl)
          {
          default:
          case 1:
          }
      }
      while (true)
      {
        localObject4 = (ConstraintLayout.LayoutParams)((View)localObject2).getLayoutParams();
        ((a.a)localObject3).a((ConstraintLayout.LayoutParams)localObject4);
        ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject4);
        ((View)localObject2).setVisibility(((a.a)localObject3).visibility);
        if (Build.VERSION.SDK_INT >= 17)
        {
          ((View)localObject2).setAlpha(((a.a)localObject3).alpha);
          ((View)localObject2).setRotation(((a.a)localObject3).rotation);
          ((View)localObject2).setRotationX(((a.a)localObject3).eT);
          ((View)localObject2).setRotationY(((a.a)localObject3).eU);
          ((View)localObject2).setScaleX(((a.a)localObject3).scaleX);
          ((View)localObject2).setScaleY(((a.a)localObject3).scaleY);
          if (!Float.isNaN(((a.a)localObject3).eV))
            ((View)localObject2).setPivotX(((a.a)localObject3).eV);
          if (!Float.isNaN(((a.a)localObject3).eW))
            ((View)localObject2).setPivotY(((a.a)localObject3).eW);
          ((View)localObject2).setTranslationX(((a.a)localObject3).eX);
          ((View)localObject2).setTranslationY(((a.a)localObject3).eY);
          if (Build.VERSION.SDK_INT >= 21)
          {
            ((View)localObject2).setTranslationZ(((a.a)localObject3).eZ);
            if (((a.a)localObject3).eR)
              ((View)localObject2).setElevation(((a.a)localObject3).eS);
          }
        }
        j++;
        break;
        localObject4 = (Barrier)localObject2;
        ((Barrier)localObject4).setId(k);
        ((Barrier)localObject4).setType(((a.a)localObject3).fk);
        ((Barrier)localObject4).setAllowsGoneWidget(((a.a)localObject3).fj);
        if (((a.a)localObject3).fn != null)
        {
          ((Barrier)localObject4).setReferencedIds(((a.a)localObject3).fn);
        }
        else if (((a.a)localObject3).fo != null)
        {
          ((a.a)localObject3).fn = a((View)localObject4, ((a.a)localObject3).fo);
          ((Barrier)localObject4).setReferencedIds(((a.a)localObject3).fn);
        }
      }
    }
    Object localObject3 = ((HashSet)localObject1).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (Integer)((Iterator)localObject3).next();
      localObject2 = (a.a)this.eL.get(localObject1);
      if (((a.a)localObject2).fl != -1);
      switch (((a.a)localObject2).fl)
      {
      default:
        if (((a.a)localObject2).eN)
        {
          localObject4 = new Guideline(paramConstraintLayout.getContext());
          ((Guideline)localObject4).setId(((Integer)localObject1).intValue());
          localObject1 = ConstraintLayout.as();
          ((a.a)localObject2).a((ConstraintLayout.LayoutParams)localObject1);
          paramConstraintLayout.addView((View)localObject4, (ViewGroup.LayoutParams)localObject1);
        }
        break;
      case 1:
        label516: localObject4 = new Barrier(paramConstraintLayout.getContext());
        ((Barrier)localObject4).setId(((Integer)localObject1).intValue());
        if (((a.a)localObject2).fn != null)
          ((Barrier)localObject4).setReferencedIds(((a.a)localObject2).fn);
        while (true)
        {
          ((Barrier)localObject4).setType(((a.a)localObject2).fk);
          ConstraintLayout.LayoutParams localLayoutParams = ConstraintLayout.as();
          ((Barrier)localObject4).ap();
          ((a.a)localObject2).a(localLayoutParams);
          paramConstraintLayout.addView((View)localObject4, localLayoutParams);
          break label516;
          break;
          if (((a.a)localObject2).fo != null)
          {
            ((a.a)localObject2).fn = a((View)localObject4, ((a.a)localObject2).fo);
            ((Barrier)localObject4).setReferencedIds(((a.a)localObject2).fn);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.constraint.a
 * JD-Core Version:    0.6.2
 */