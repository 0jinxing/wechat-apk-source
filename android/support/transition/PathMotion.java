package android.support.transition;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;

public abstract class PathMotion
{
  public PathMotion()
  {
  }

  public PathMotion(Context paramContext, AttributeSet paramAttributeSet)
  {
  }

  public abstract Path getPath(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.transition.PathMotion
 * JD-Core Version:    0.6.2
 */