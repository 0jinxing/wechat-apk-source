package android.support.v4.widget;

import android.graphics.Rect;

final class k
{
  private static int A(int paramInt1, int paramInt2)
  {
    return paramInt1 * 13 * paramInt1 + paramInt2 * paramInt2;
  }

  public static <L, T> T a(L paramL, b<L, T> paramb, k.a<T> parama, T paramT, Rect paramRect, int paramInt)
  {
    Rect localRect1 = new Rect(paramRect);
    Object localObject1;
    Rect localRect2;
    int j;
    label103: int k;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    case 17:
      localRect1.offset(paramRect.width() + 1, 0);
      localObject1 = null;
      int i = paramb.L(paramL);
      localRect2 = new Rect();
      j = 0;
      if (j < i)
      {
        Object localObject2 = paramb.get(paramL, j);
        if (localObject2 == paramT)
          break label330;
        parama.b(localObject2, localRect2);
        if (a(paramRect, localRect2, paramInt))
          if (!a(paramRect, localRect1, paramInt))
          {
            k = 1;
            label164: if (k == 0)
              break label330;
            localRect1.set(localRect2);
            localObject1 = localObject2;
          }
      }
      break;
    case 66:
    case 33:
    case 130:
    }
    label330: 
    while (true)
    {
      j++;
      break label103;
      localRect1.offset(-(paramRect.width() + 1), 0);
      break;
      localRect1.offset(0, paramRect.height() + 1);
      break;
      localRect1.offset(0, -(paramRect.height() + 1));
      break;
      if (a(paramInt, paramRect, localRect2, localRect1))
      {
        k = 1;
        break label164;
      }
      if ((!a(paramInt, paramRect, localRect1, localRect2)) && (A(c(paramInt, paramRect, localRect2), g(paramInt, paramRect, localRect2)) < A(c(paramInt, paramRect, localRect1), g(paramInt, paramRect, localRect1))))
      {
        k = 1;
        break label164;
      }
      k = 0;
      break label164;
      return localObject1;
    }
  }

  private static boolean a(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    boolean bool = true;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    case 17:
    case 66:
      if ((paramRect2.bottom < paramRect1.top) || (paramRect2.top > paramRect1.bottom))
        break;
    case 33:
    case 130:
    }
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if ((paramRect2.right < paramRect1.left) || (paramRect2.left > paramRect1.right))
        bool = false;
    }
  }

  private static boolean a(int paramInt, Rect paramRect1, Rect paramRect2, Rect paramRect3)
  {
    boolean bool1 = true;
    boolean bool2 = a(paramInt, paramRect1, paramRect2);
    if ((a(paramInt, paramRect1, paramRect3)) || (!bool2))
      bool2 = false;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (b(paramInt, paramRect1, paramRect3))
      {
        bool2 = bool1;
        if (paramInt != 17)
        {
          bool2 = bool1;
          if (paramInt != 66)
          {
            bool2 = bool1;
            if (c(paramInt, paramRect1, paramRect2) >= e(paramInt, paramRect1, paramRect3))
              bool2 = false;
          }
        }
      }
    }
  }

  private static boolean a(Rect paramRect1, Rect paramRect2, int paramInt)
  {
    boolean bool = true;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    case 17:
      if (((paramRect1.right <= paramRect2.right) && (paramRect1.left < paramRect2.right)) || (paramRect1.left <= paramRect2.left))
        break;
    case 66:
    case 33:
    case 130:
    }
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if (((paramRect1.left >= paramRect2.left) && (paramRect1.right > paramRect2.left)) || (paramRect1.right >= paramRect2.right))
      {
        bool = false;
        continue;
        if (((paramRect1.bottom <= paramRect2.bottom) && (paramRect1.top < paramRect2.bottom)) || (paramRect1.top <= paramRect2.top))
        {
          bool = false;
          continue;
          if (((paramRect1.top >= paramRect2.top) && (paramRect1.bottom > paramRect2.top)) || (paramRect1.bottom >= paramRect2.bottom))
            bool = false;
        }
      }
    }
  }

  private static boolean b(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    boolean bool = true;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    case 17:
      if (paramRect1.left < paramRect2.right)
        break;
    case 66:
    case 33:
    case 130:
    }
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if (paramRect1.right > paramRect2.left)
      {
        bool = false;
        continue;
        if (paramRect1.top < paramRect2.bottom)
        {
          bool = false;
          continue;
          if (paramRect1.bottom > paramRect2.top)
            bool = false;
        }
      }
    }
  }

  private static int c(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    return Math.max(0, d(paramInt, paramRect1, paramRect2));
  }

  private static int d(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    case 17:
      paramInt = paramRect1.left - paramRect2.right;
    case 66:
    case 33:
    case 130:
    }
    while (true)
    {
      return paramInt;
      paramInt = paramRect2.left - paramRect1.right;
      continue;
      paramInt = paramRect1.top - paramRect2.bottom;
      continue;
      paramInt = paramRect2.top - paramRect1.bottom;
    }
  }

  private static int e(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    return Math.max(1, f(paramInt, paramRect1, paramRect2));
  }

  private static int f(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    case 17:
      paramInt = paramRect1.left - paramRect2.left;
    case 66:
    case 33:
    case 130:
    }
    while (true)
    {
      return paramInt;
      paramInt = paramRect2.right - paramRect1.right;
      continue;
      paramInt = paramRect1.top - paramRect2.top;
      continue;
      paramInt = paramRect2.bottom - paramRect1.bottom;
    }
  }

  private static int g(int paramInt, Rect paramRect1, Rect paramRect2)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    case 17:
    case 66:
    case 33:
    case 130:
    }
    for (paramInt = Math.abs(paramRect1.top + paramRect1.height() / 2 - (paramRect2.top + paramRect2.height() / 2)); ; paramInt = Math.abs(paramRect1.left + paramRect1.width() / 2 - (paramRect2.left + paramRect2.width() / 2)))
      return paramInt;
  }

  public static abstract interface b<T, V>
  {
    public abstract int L(T paramT);

    public abstract V get(T paramT, int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.k
 * JD-Core Version:    0.6.2
 */