package android.support.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.support.v4.view.b.a;
import android.support.v4.view.b.b;
import android.support.v4.view.b.c;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class d
{
  public static Interpolator loadInterpolator(Context paramContext, int paramInt)
  {
    Object localObject1 = null;
    if (Build.VERSION.SDK_INT >= 21)
      paramContext = AnimationUtils.loadInterpolator(paramContext, paramInt);
    while (true)
    {
      return paramContext;
      if (paramInt == 17563663);
      label119: Object localObject4;
      try
      {
        paramContext = new a();
        continue;
      }
      catch (XmlPullParserException localXmlPullParserException1)
      {
        paramContext = (Context)localObject1;
        try
        {
          localObject5 = new android/content/res/Resources$NotFoundException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("Can't load animation resource ID #0x");
          ((Resources.NotFoundException)localObject5).<init>(Integer.toHexString(paramInt));
          ((Resources.NotFoundException)localObject5).initCause(localXmlPullParserException1);
          throw ((Throwable)localObject5);
        }
        finally
        {
          localObject5 = paramContext;
        }
        if (localObject5 != null)
          ((XmlResourceParser)localObject5).close();
        throw paramContext;
        if (paramInt == 17563661)
        {
          paramContext = new b();
          continue;
        }
      }
      catch (IOException paramContext)
      {
        while (true)
        {
          localObject1 = null;
          localObject5 = localObject1;
          try
          {
            localObject6 = new android/content/res/Resources$NotFoundException;
            localObject5 = localObject1;
            localObject3 = new java/lang/StringBuilder;
            localObject5 = localObject1;
            ((StringBuilder)localObject3).<init>("Can't load animation resource ID #0x");
            localObject5 = localObject1;
            ((Resources.NotFoundException)localObject6).<init>(Integer.toHexString(paramInt));
            localObject5 = localObject1;
            ((Resources.NotFoundException)localObject6).initCause(paramContext);
            localObject5 = localObject1;
            throw ((Throwable)localObject6);
          }
          finally
          {
          }
        }
        if (paramInt == 17563662)
        {
          paramContext = new c();
          continue;
        }
      }
      finally
      {
        Object localObject6;
        while (true)
          localObject5 = null;
        Object localObject3 = paramContext.getResources().getAnimation(paramInt);
        localObject1 = localObject3;
        Object localObject5 = localObject1;
        while (true)
        {
          try
          {
            paramContext.getResources();
            localObject5 = localObject1;
            paramContext.getTheme();
            localObject5 = localObject1;
            int i = ((XmlPullParser)localObject1).getDepth();
            localObject3 = null;
            localObject5 = localObject1;
            int j = ((XmlPullParser)localObject1).next();
            if (j == 3)
            {
              localObject5 = localObject1;
              if (((XmlPullParser)localObject1).getDepth() <= i)
                break label648;
            }
            if (j == 1)
              break label648;
            if (j != 2)
              continue;
            localObject5 = localObject1;
            localObject6 = Xml.asAttributeSet((XmlPullParser)localObject1);
            localObject5 = localObject1;
            localObject3 = ((XmlPullParser)localObject1).getName();
            localObject5 = localObject1;
            if (((String)localObject3).equals("linearInterpolator"))
            {
              localObject5 = localObject1;
              localObject3 = new LinearInterpolator();
              continue;
            }
          }
          catch (XmlPullParserException localXmlPullParserException2)
          {
            paramContext = (Context)localObject1;
            break;
            localObject5 = localObject1;
            if (!localXmlPullParserException2.equals("accelerateInterpolator"))
              break label373;
            localObject5 = localObject1;
            localObject4 = new AccelerateInterpolator(paramContext, (AttributeSet)localObject6);
            continue;
          }
          catch (IOException paramContext)
          {
          }
          break label119;
          label373: localObject5 = localObject1;
          if (((String)localObject4).equals("decelerateInterpolator"))
          {
            localObject5 = localObject1;
            localObject4 = new DecelerateInterpolator(paramContext, (AttributeSet)localObject6);
          }
          else
          {
            localObject5 = localObject1;
            if (((String)localObject4).equals("accelerateDecelerateInterpolator"))
            {
              localObject5 = localObject1;
              localObject4 = new AccelerateDecelerateInterpolator();
            }
            else
            {
              localObject5 = localObject1;
              if (((String)localObject4).equals("cycleInterpolator"))
              {
                localObject5 = localObject1;
                localObject4 = new CycleInterpolator(paramContext, (AttributeSet)localObject6);
              }
              else
              {
                localObject5 = localObject1;
                if (((String)localObject4).equals("anticipateInterpolator"))
                {
                  localObject5 = localObject1;
                  localObject4 = new AnticipateInterpolator(paramContext, (AttributeSet)localObject6);
                }
                else
                {
                  localObject5 = localObject1;
                  if (((String)localObject4).equals("overshootInterpolator"))
                  {
                    localObject5 = localObject1;
                    localObject4 = new OvershootInterpolator(paramContext, (AttributeSet)localObject6);
                  }
                  else
                  {
                    localObject5 = localObject1;
                    if (((String)localObject4).equals("anticipateOvershootInterpolator"))
                    {
                      localObject5 = localObject1;
                      localObject4 = new AnticipateOvershootInterpolator(paramContext, (AttributeSet)localObject6);
                    }
                    else
                    {
                      localObject5 = localObject1;
                      if (((String)localObject4).equals("bounceInterpolator"))
                      {
                        localObject5 = localObject1;
                        localObject4 = new BounceInterpolator();
                      }
                      else
                      {
                        localObject5 = localObject1;
                        if (!((String)localObject4).equals("pathInterpolator"))
                          break label600;
                        localObject5 = localObject1;
                        localObject4 = new g(paramContext, (AttributeSet)localObject6, (XmlPullParser)localObject1);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        label600: localObject5 = localObject1;
        paramContext = new java/lang/RuntimeException;
        localObject5 = localObject1;
        localObject4 = new java/lang/StringBuilder;
        localObject5 = localObject1;
        ((StringBuilder)localObject4).<init>("Unknown interpolator name: ");
        localObject5 = localObject1;
        paramContext.<init>(((XmlPullParser)localObject1).getName());
        localObject5 = localObject1;
      }
      label648: paramContext = (Context)localObject4;
      if (localObject1 != null)
      {
        ((XmlResourceParser)localObject1).close();
        paramContext = (Context)localObject4;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.c.a.d
 * JD-Core Version:    0.6.2
 */