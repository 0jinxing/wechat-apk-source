package android.support.c.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.a.c.b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public final class e
{
  // ERROR //
  public static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: aload_1
    //   10: iload_3
    //   11: invokevirtual 18	android/content/res/Resources:getAnimation	(I)Landroid/content/res/XmlResourceParser;
    //   14: astore 7
    //   16: aload 7
    //   18: astore 6
    //   20: aload 7
    //   22: astore 4
    //   24: aload 7
    //   26: astore 5
    //   28: aload_0
    //   29: aload_1
    //   30: aload_2
    //   31: aload 7
    //   33: aload 7
    //   35: invokestatic 24	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   38: aconst_null
    //   39: iconst_0
    //   40: fconst_1
    //   41: invokestatic 27	android/support/c/a/e:a	(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator;
    //   44: astore_0
    //   45: aload 7
    //   47: ifnull +10 -> 57
    //   50: aload 7
    //   52: invokeinterface 33 1 0
    //   57: aload_0
    //   58: areturn
    //   59: astore_1
    //   60: aload 6
    //   62: astore 4
    //   64: new 35	android/content/res/Resources$NotFoundException
    //   67: astore_0
    //   68: aload 6
    //   70: astore 4
    //   72: new 37	java/lang/StringBuilder
    //   75: astore_2
    //   76: aload 6
    //   78: astore 4
    //   80: aload_2
    //   81: ldc 39
    //   83: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   86: aload 6
    //   88: astore 4
    //   90: aload_0
    //   91: aload_2
    //   92: iload_3
    //   93: invokestatic 49	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   96: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokespecial 58	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   105: aload 6
    //   107: astore 4
    //   109: aload_0
    //   110: aload_1
    //   111: invokevirtual 62	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   114: pop
    //   115: aload 6
    //   117: astore 4
    //   119: aload_0
    //   120: athrow
    //   121: astore_0
    //   122: aload 4
    //   124: ifnull +10 -> 134
    //   127: aload 4
    //   129: invokeinterface 33 1 0
    //   134: aload_0
    //   135: athrow
    //   136: astore_0
    //   137: aload 5
    //   139: astore 4
    //   141: new 35	android/content/res/Resources$NotFoundException
    //   144: astore_2
    //   145: aload 5
    //   147: astore 4
    //   149: new 37	java/lang/StringBuilder
    //   152: astore_1
    //   153: aload 5
    //   155: astore 4
    //   157: aload_1
    //   158: ldc 39
    //   160: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   163: aload 5
    //   165: astore 4
    //   167: aload_2
    //   168: aload_1
    //   169: iload_3
    //   170: invokestatic 49	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   173: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: invokespecial 58	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   182: aload 5
    //   184: astore 4
    //   186: aload_2
    //   187: aload_0
    //   188: invokevirtual 62	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   191: pop
    //   192: aload 5
    //   194: astore 4
    //   196: aload_2
    //   197: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   9	16	59	org/xmlpull/v1/XmlPullParserException
    //   28	45	59	org/xmlpull/v1/XmlPullParserException
    //   9	16	121	finally
    //   28	45	121	finally
    //   64	68	121	finally
    //   72	76	121	finally
    //   80	86	121	finally
    //   90	105	121	finally
    //   109	115	121	finally
    //   119	121	121	finally
    //   141	145	121	finally
    //   149	153	121	finally
    //   157	163	121	finally
    //   167	182	121	finally
    //   186	192	121	finally
    //   196	198	121	finally
    //   9	16	136	java/io/IOException
    //   28	45	136	java/io/IOException
  }

  private static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, AnimatorSet paramAnimatorSet, int paramInt, float paramFloat)
  {
    Object localObject1 = null;
    ArrayList localArrayList = null;
    int i = paramXmlPullParser.getDepth();
    int j;
    Object localObject2;
    label85: 
    do
    {
      do
      {
        do
        {
          j = paramXmlPullParser.next();
          if (((j == 3) && (paramXmlPullParser.getDepth() <= i)) || (j == 1))
            break;
        }
        while (j != 2);
        localObject2 = paramXmlPullParser.getName();
        if (!((String)localObject2).equals("objectAnimator"))
          break;
        localObject2 = a(paramContext, paramResources, paramTheme, paramAttributeSet, paramFloat, paramXmlPullParser);
        j = 0;
        localObject1 = localObject2;
      }
      while (paramAnimatorSet == null);
      localObject1 = localObject2;
    }
    while (j != 0);
    if (localArrayList == null)
      localArrayList = new ArrayList();
    while (true)
    {
      localArrayList.add(localObject2);
      localObject1 = localObject2;
      break;
      if (((String)localObject2).equals("animator"))
      {
        localObject2 = a(paramContext, paramResources, paramTheme, paramAttributeSet, null, paramFloat, paramXmlPullParser);
        j = 0;
        break label85;
      }
      if (((String)localObject2).equals("set"))
      {
        localObject2 = new AnimatorSet();
        localObject1 = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.uo);
        j = android.support.v4.content.a.c.a((TypedArray)localObject1, paramXmlPullParser, "ordering", 0, 0);
        a(paramContext, paramResources, paramTheme, paramXmlPullParser, paramAttributeSet, (AnimatorSet)localObject2, j, paramFloat);
        ((TypedArray)localObject1).recycle();
        j = 0;
        break label85;
      }
      if (((String)localObject2).equals("propertyValuesHolder"))
      {
        localObject2 = a(paramContext, paramResources, paramTheme, paramXmlPullParser, Xml.asAttributeSet(paramXmlPullParser));
        if ((localObject2 != null) && (localObject1 != null) && ((localObject1 instanceof ValueAnimator)))
          ((ValueAnimator)localObject1).setValues((PropertyValuesHolder[])localObject2);
        j = 1;
        localObject2 = localObject1;
        break label85;
      }
      throw new RuntimeException("Unknown animator name: " + paramXmlPullParser.getName());
      if ((paramAnimatorSet != null) && (localArrayList != null))
      {
        paramContext = new Animator[localArrayList.size()];
        paramResources = localArrayList.iterator();
        for (j = 0; paramResources.hasNext(); j++)
          paramContext[j] = ((Animator)paramResources.next());
        if (paramInt != 0)
          break label395;
        paramAnimatorSet.playTogether(paramContext);
      }
      while (true)
      {
        return localObject1;
        label395: paramAnimatorSet.playSequentially(paramContext);
      }
    }
  }

  private static Keyframe a(Keyframe paramKeyframe, float paramFloat)
  {
    if (paramKeyframe.getType() == Float.TYPE)
      paramKeyframe = Keyframe.ofFloat(paramFloat);
    while (true)
    {
      return paramKeyframe;
      if (paramKeyframe.getType() == Integer.TYPE)
        paramKeyframe = Keyframe.ofInt(paramFloat);
      else
        paramKeyframe = Keyframe.ofObject(paramFloat);
    }
  }

  private static ObjectAnimator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    ObjectAnimator localObjectAnimator = new ObjectAnimator();
    a(paramContext, paramResources, paramTheme, paramAttributeSet, localObjectAnimator, paramFloat, paramXmlPullParser);
    return localObjectAnimator;
  }

  private static PropertyValuesHolder a(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    Object localObject = paramTypedArray.peekValue(paramInt2);
    int i;
    int j;
    label27: int k;
    label42: int m;
    label54: int n;
    if (localObject != null)
    {
      i = 1;
      if (i == 0)
        break label212;
      j = ((TypedValue)localObject).type;
      localObject = paramTypedArray.peekValue(paramInt3);
      if (localObject == null)
        break label218;
      k = 1;
      if (k == 0)
        break label224;
      m = ((TypedValue)localObject).type;
      n = paramInt1;
      if (paramInt1 == 4)
      {
        if (((i == 0) || (!am(j))) && ((k == 0) || (!am(m))))
          break label230;
        n = 3;
      }
      label91: if (n != 0)
        break label236;
      paramInt1 = 1;
    }
    c.b[] arrayOfb1;
    c.b[] arrayOfb2;
    while (true)
      if (n == 2)
      {
        localObject = paramTypedArray.getString(paramInt2);
        String str = paramTypedArray.getString(paramInt3);
        arrayOfb1 = android.support.v4.a.c.L((String)localObject);
        arrayOfb2 = android.support.v4.a.c.L(str);
        if ((arrayOfb1 == null) && (arrayOfb2 == null))
          break label699;
        if (arrayOfb1 != null)
        {
          paramTypedArray = new a((byte)0);
          if (arrayOfb2 != null)
          {
            if (!android.support.v4.a.c.a(arrayOfb1, arrayOfb2))
            {
              throw new InflateException(" Can't morph from " + (String)localObject + " to " + str);
              i = 0;
              break;
              label212: j = 0;
              break label27;
              label218: k = 0;
              break label42;
              label224: m = 0;
              break label54;
              label230: n = 0;
              break label91;
              label236: paramInt1 = 0;
              continue;
            }
            paramString = PropertyValuesHolder.ofObject(paramString, paramTypedArray, new Object[] { arrayOfb1, arrayOfb2 });
          }
        }
      }
    while (true)
    {
      return paramString;
      paramString = PropertyValuesHolder.ofObject(paramString, paramTypedArray, new Object[] { arrayOfb1 });
      continue;
      if (arrayOfb2 != null)
      {
        paramString = PropertyValuesHolder.ofObject(paramString, new a((byte)0), new Object[] { arrayOfb2 });
        continue;
        localObject = null;
        if (n == 3)
          localObject = f.cF();
        float f1;
        label355: float f2;
        if (paramInt1 != 0)
          if (i != 0)
            if (j == 5)
            {
              f1 = paramTypedArray.getDimension(paramInt2, 0.0F);
              if (k == 0)
                break label442;
              if (m != 5)
                break label431;
              f2 = paramTypedArray.getDimension(paramInt3, 0.0F);
              label374: paramTypedArray = PropertyValuesHolder.ofFloat(paramString, new float[] { f1, f2 });
            }
        while (true)
        {
          paramString = paramTypedArray;
          if (paramTypedArray == null)
            break;
          paramString = paramTypedArray;
          if (localObject == null)
            break;
          paramTypedArray.setEvaluator((TypeEvaluator)localObject);
          paramString = paramTypedArray;
          break;
          f1 = paramTypedArray.getFloat(paramInt2, 0.0F);
          break label355;
          label431: f2 = paramTypedArray.getFloat(paramInt3, 0.0F);
          break label374;
          label442: paramTypedArray = PropertyValuesHolder.ofFloat(paramString, new float[] { f1 });
          continue;
          if (m == 5);
          for (f1 = paramTypedArray.getDimension(paramInt3, 0.0F); ; f1 = paramTypedArray.getFloat(paramInt3, 0.0F))
          {
            paramTypedArray = PropertyValuesHolder.ofFloat(paramString, new float[] { f1 });
            break;
          }
          if (i != 0)
          {
            if (j == 5)
            {
              paramInt1 = (int)paramTypedArray.getDimension(paramInt2, 0.0F);
              label520: if (k == 0)
                break label615;
              if (m != 5)
                break label587;
              paramInt2 = (int)paramTypedArray.getDimension(paramInt3, 0.0F);
            }
            while (true)
            {
              paramTypedArray = PropertyValuesHolder.ofInt(paramString, new int[] { paramInt1, paramInt2 });
              break;
              if (am(j))
              {
                paramInt1 = paramTypedArray.getColor(paramInt2, 0);
                break label520;
              }
              paramInt1 = paramTypedArray.getInt(paramInt2, 0);
              break label520;
              label587: if (am(m))
                paramInt2 = paramTypedArray.getColor(paramInt3, 0);
              else
                paramInt2 = paramTypedArray.getInt(paramInt3, 0);
            }
            label615: paramTypedArray = PropertyValuesHolder.ofInt(paramString, new int[] { paramInt1 });
          }
          else
          {
            if (k != 0)
            {
              if (m == 5)
                paramInt1 = (int)paramTypedArray.getDimension(paramInt3, 0.0F);
              while (true)
              {
                paramTypedArray = PropertyValuesHolder.ofInt(paramString, new int[] { paramInt1 });
                break;
                if (am(m))
                  paramInt1 = paramTypedArray.getColor(paramInt3, 0);
                else
                  paramInt1 = paramTypedArray.getInt(paramInt3, 0);
              }
            }
            paramTypedArray = null;
          }
        }
      }
      else
      {
        label699: paramString = null;
      }
    }
  }

  private static ValueAnimator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, ValueAnimator paramValueAnimator, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    TypedArray localTypedArray = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.un);
    paramTheme = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.ur);
    paramResources = paramValueAnimator;
    if (paramValueAnimator == null)
      paramResources = new ValueAnimator();
    a(paramResources, localTypedArray, paramTheme, paramFloat, paramXmlPullParser);
    int i = android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "interpolator", 0);
    if (i > 0)
      paramResources.setInterpolator(d.loadInterpolator(paramContext, i));
    localTypedArray.recycle();
    if (paramTheme != null)
      paramTheme.recycle();
    return paramResources;
  }

  private static void a(ValueAnimator paramValueAnimator, TypedArray paramTypedArray1, TypedArray paramTypedArray2, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    long l1 = android.support.v4.content.a.c.a(paramTypedArray1, paramXmlPullParser, "duration", 1, 300);
    long l2 = android.support.v4.content.a.c.a(paramTypedArray1, paramXmlPullParser, "startOffset", 2, 0);
    int i = android.support.v4.content.a.c.a(paramTypedArray1, paramXmlPullParser, "valueType", 7, 4);
    Object localObject;
    label103: int k;
    label119: int m;
    if ((android.support.v4.content.a.c.a(paramXmlPullParser, "valueFrom")) && (android.support.v4.content.a.c.a(paramXmlPullParser, "valueTo")))
    {
      j = i;
      if (i == 4)
      {
        localObject = paramTypedArray1.peekValue(5);
        if (localObject == null)
          break label324;
        j = 1;
        if (j == 0)
          break label330;
        i = ((TypedValue)localObject).type;
        localObject = paramTypedArray1.peekValue(6);
        if (localObject == null)
          break label336;
        k = 1;
        if (k == 0)
          break label342;
        m = ((TypedValue)localObject).type;
        label131: if (((j == 0) || (!am(i))) && ((k == 0) || (!am(m))))
          break label348;
      }
    }
    label324: label330: label336: label342: label348: for (int j = 3; ; j = 0)
    {
      localObject = a(paramTypedArray1, j, 5, 6, "");
      if (localObject != null)
        paramValueAnimator.setValues(new PropertyValuesHolder[] { localObject });
      paramValueAnimator.setDuration(l1);
      paramValueAnimator.setStartDelay(l2);
      paramValueAnimator.setRepeatCount(android.support.v4.content.a.c.a(paramTypedArray1, paramXmlPullParser, "repeatCount", 3, 0));
      paramValueAnimator.setRepeatMode(android.support.v4.content.a.c.a(paramTypedArray1, paramXmlPullParser, "repeatMode", 4, 1));
      if (paramTypedArray2 == null)
        break label371;
      paramTypedArray1 = (ObjectAnimator)paramValueAnimator;
      localObject = android.support.v4.content.a.c.b(paramTypedArray2, paramXmlPullParser, "pathData", 1);
      if (localObject == null)
        break label372;
      paramValueAnimator = android.support.v4.content.a.c.b(paramTypedArray2, paramXmlPullParser, "propertyXName", 2);
      paramXmlPullParser = android.support.v4.content.a.c.b(paramTypedArray2, paramXmlPullParser, "propertyYName", 3);
      if ((paramValueAnimator != null) || (paramXmlPullParser != null))
        break label354;
      throw new InflateException(paramTypedArray2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
      j = 0;
      break;
      i = 0;
      break label103;
      k = 0;
      break label119;
      m = 0;
      break label131;
    }
    label354: a(android.support.v4.a.c.K((String)localObject), paramTypedArray1, 0.5F * paramFloat, paramValueAnimator, paramXmlPullParser);
    while (true)
    {
      label371: return;
      label372: paramTypedArray1.setPropertyName(android.support.v4.content.a.c.b(paramTypedArray2, paramXmlPullParser, "propertyName", 0));
    }
  }

  private static void a(Path paramPath, ObjectAnimator paramObjectAnimator, float paramFloat, String paramString1, String paramString2)
  {
    Object localObject = new PathMeasure(paramPath, false);
    float f1 = 0.0F;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Float.valueOf(0.0F));
    float f2;
    do
    {
      f2 = f1 + ((PathMeasure)localObject).getLength();
      localArrayList.add(Float.valueOf(f2));
      f1 = f2;
    }
    while (((PathMeasure)localObject).nextContour());
    paramPath = new PathMeasure(paramPath, false);
    int i = Math.min(100, (int)(f2 / paramFloat) + 1);
    float[] arrayOfFloat1 = new float[i];
    localObject = new float[i];
    float[] arrayOfFloat2 = new float[2];
    int j = 0;
    f1 = f2 / (i - 1);
    int k = 0;
    paramFloat = 0.0F;
    if (k < i)
    {
      paramPath.getPosTan(paramFloat, arrayOfFloat2, null);
      arrayOfFloat1[k] = arrayOfFloat2[0];
      localObject[k] = arrayOfFloat2[1];
      paramFloat += f1;
      if ((j + 1 >= localArrayList.size()) || (paramFloat <= ((Float)localArrayList.get(j + 1)).floatValue()))
        break label315;
      paramFloat -= ((Float)localArrayList.get(j + 1)).floatValue();
      paramPath.nextContour();
      j++;
    }
    label315: 
    while (true)
    {
      k++;
      break;
      paramPath = null;
      localArrayList = null;
      if (paramString1 != null)
        paramPath = PropertyValuesHolder.ofFloat(paramString1, arrayOfFloat1);
      paramString1 = localArrayList;
      if (paramString2 != null)
        paramString1 = PropertyValuesHolder.ofFloat(paramString2, (float[])localObject);
      if (paramPath == null)
        paramObjectAnimator.setValues(new PropertyValuesHolder[] { paramString1 });
      while (true)
      {
        return;
        if (paramString1 == null)
          paramObjectAnimator.setValues(new PropertyValuesHolder[] { paramPath });
        else
          paramObjectAnimator.setValues(new PropertyValuesHolder[] { paramPath, paramString1 });
      }
    }
  }

  private static void a(Keyframe[] paramArrayOfKeyframe, float paramFloat, int paramInt1, int paramInt2)
  {
    paramFloat /= (paramInt2 - paramInt1 + 2);
    while (paramInt1 <= paramInt2)
    {
      paramArrayOfKeyframe[paramInt1].setFraction(paramArrayOfKeyframe[(paramInt1 - 1)].getFraction() + paramFloat);
      paramInt1++;
    }
  }

  private static PropertyValuesHolder[] a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    ArrayList localArrayList = null;
    int i;
    while (true)
    {
      i = paramXmlPullParser.getEventType();
      if ((i == 3) || (i == 1))
        break label899;
      if (i == 2)
        break;
      paramXmlPullParser.next();
    }
    Object localObject1;
    int k;
    if (paramXmlPullParser.getName().equals("propertyValuesHolder"))
    {
      TypedArray localTypedArray1 = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.up);
      String str = android.support.v4.content.a.c.b(localTypedArray1, paramXmlPullParser, "propertyName", 3);
      int j = android.support.v4.content.a.c.a(localTypedArray1, paramXmlPullParser, "valueType", 2, 4);
      localObject1 = null;
      i = j;
      k = paramXmlPullParser.next();
      Object localObject2;
      Object localObject3;
      label183: label202: float f;
      int m;
      if ((k != 3) && (k != 1))
      {
        localObject2 = localObject1;
        k = i;
        TypedArray localTypedArray2;
        if (paramXmlPullParser.getName().equals("keyframe"))
        {
          k = i;
          if (i == 4)
          {
            localObject3 = android.support.v4.content.a.c.a(paramResources, paramTheme, Xml.asAttributeSet(paramXmlPullParser), a.uq);
            localObject2 = android.support.v4.content.a.c.a((TypedArray)localObject3, paramXmlPullParser, "value");
            if (localObject2 == null)
              break label418;
            i = 1;
            if ((i == 0) || (!am(((TypedValue)localObject2).type)))
              break label424;
            i = 3;
            ((TypedArray)localObject3).recycle();
            k = i;
          }
          localTypedArray2 = android.support.v4.content.a.c.a(paramResources, paramTheme, Xml.asAttributeSet(paramXmlPullParser), a.uq);
          localObject2 = null;
          f = android.support.v4.content.a.c.a(localTypedArray2, paramXmlPullParser, "fraction", 3, -1.0F);
          localObject3 = android.support.v4.content.a.c.a(localTypedArray2, paramXmlPullParser, "value");
          if (localObject3 == null)
            break label430;
          m = 1;
          label262: if (k != 4)
            break label969;
          if ((m == 0) || (!am(((TypedValue)localObject3).type)))
            break label436;
          i = 3;
          label287: if (m == 0)
            break label484;
          localObject3 = localObject2;
          switch (i)
          {
          default:
            localObject3 = localObject2;
          case 2:
          case 0:
          case 1:
          case 3:
          }
        }
        while (true)
        {
          i = android.support.v4.content.a.c.a(localTypedArray2, paramXmlPullParser, "interpolator", 1);
          if (i > 0)
            ((Keyframe)localObject3).setInterpolator(d.loadInterpolator(paramContext, i));
          localTypedArray2.recycle();
          localObject2 = localObject1;
          if (localObject3 != null)
          {
            localObject2 = localObject1;
            if (localObject1 == null)
              localObject2 = new ArrayList();
            ((ArrayList)localObject2).add(localObject3);
          }
          paramXmlPullParser.next();
          localObject1 = localObject2;
          i = k;
          break;
          label418: i = 0;
          break label183;
          label424: i = 0;
          break label202;
          label430: m = 0;
          break label262;
          label436: i = 0;
          break label287;
          localObject3 = Keyframe.ofFloat(f, android.support.v4.content.a.c.a(localTypedArray2, paramXmlPullParser, "value", 0, 0.0F));
          continue;
          localObject3 = Keyframe.ofInt(f, android.support.v4.content.a.c.a(localTypedArray2, paramXmlPullParser, "value", 0, 0));
          continue;
          label484: if (i == 0)
            localObject3 = Keyframe.ofFloat(f);
          else
            localObject3 = Keyframe.ofInt(f);
        }
      }
      else if (localObject1 != null)
      {
        k = ((ArrayList)localObject1).size();
        if (k > 0)
        {
          localObject2 = (Keyframe)((ArrayList)localObject1).get(0);
          localObject3 = (Keyframe)((ArrayList)localObject1).get(k - 1);
          f = ((Keyframe)localObject3).getFraction();
          if (f < 1.0F)
          {
            label578: int n;
            if (f < 0.0F)
            {
              ((Keyframe)localObject3).setFraction(1.0F);
              f = ((Keyframe)localObject2).getFraction();
              n = k;
              if (f != 0.0F)
              {
                if (f >= 0.0F)
                  break label694;
                ((Keyframe)localObject2).setFraction(0.0F);
                n = k;
              }
              label613: localObject3 = new Keyframe[n];
              ((ArrayList)localObject1).toArray((Object[])localObject3);
              k = 0;
              label631: if (k >= n)
                break label808;
              localObject1 = localObject3[k];
              if (((Keyframe)localObject1).getFraction() < 0.0F)
              {
                if (k != 0)
                  break label715;
                ((Keyframe)localObject1).setFraction(0.0F);
              }
            }
            while (true)
            {
              k++;
              break label631;
              ((ArrayList)localObject1).add(((ArrayList)localObject1).size(), a((Keyframe)localObject3, 1.0F));
              k++;
              break;
              label694: ((ArrayList)localObject1).add(0, a((Keyframe)localObject2, 0.0F));
              n = k + 1;
              break label613;
              label715: if (k == n - 1)
              {
                ((Keyframe)localObject1).setFraction(1.0F);
              }
              else
              {
                m = k + 1;
                int i1 = k;
                while ((m < n - 1) && (localObject3[m].getFraction() < 0.0F))
                {
                  i1 = m;
                  m++;
                }
                a((Keyframe[])localObject3, localObject3[(i1 + 1)].getFraction() - localObject3[(k - 1)].getFraction(), k, i1);
              }
            }
            label808: localObject3 = PropertyValuesHolder.ofKeyframe(str, (Keyframe[])localObject3);
            localObject1 = localObject3;
            if (i == 3)
            {
              ((PropertyValuesHolder)localObject3).setEvaluator(f.cF());
              localObject1 = localObject3;
            }
            label839: if (localObject1 == null)
            {
              localObject1 = a(localTypedArray1, j, 0, 1, str);
              label857: if (localObject1 != null)
                if (localArrayList == null)
                {
                  localArrayList = new ArrayList();
                  label876: localArrayList.add(localObject1);
                  label884: localTypedArray1.recycle();
                }
            }
          }
        }
      }
    }
    while (true)
    {
      paramXmlPullParser.next();
      break;
      label899: paramContext = null;
      if (localArrayList != null)
      {
        k = localArrayList.size();
        paramContext = new PropertyValuesHolder[k];
        for (i = 0; i < k; i++)
          paramContext[i] = ((PropertyValuesHolder)localArrayList.get(i));
      }
      return paramContext;
      break label876;
      break label884;
      break label857;
      break label578;
      localObject1 = null;
      break label839;
      label969: i = k;
      break label287;
    }
  }

  private static boolean am(int paramInt)
  {
    if ((paramInt >= 28) && (paramInt <= 31));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static final class a
    implements TypeEvaluator<c.b[]>
  {
    private c.b[] uF;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.c.a.e
 * JD-Core Version:    0.6.2
 */