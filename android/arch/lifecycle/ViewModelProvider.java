package android.arch.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ViewModelProvider
{
  private final Factory cQ;
  private final ViewModelStore mViewModelStore;

  public ViewModelProvider(ViewModelStore paramViewModelStore, Factory paramFactory)
  {
    this.cQ = paramFactory;
    this.mViewModelStore = paramViewModelStore;
  }

  public ViewModelProvider(ViewModelStoreOwner paramViewModelStoreOwner, Factory paramFactory)
  {
    this(paramViewModelStoreOwner.getViewModelStore(), paramFactory);
  }

  public <T extends ViewModel> T get(Class<T> paramClass)
  {
    String str = paramClass.getCanonicalName();
    if (str == null)
      throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    return get("android.arch.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(str)), paramClass);
  }

  public <T extends ViewModel> T get(String paramString, Class<T> paramClass)
  {
    ViewModel localViewModel = (ViewModel)this.mViewModelStore.cS.get(paramString);
    if (paramClass.isInstance(localViewModel));
    for (paramString = localViewModel; ; paramString = paramClass)
    {
      return paramString;
      paramClass = this.cQ.create(paramClass);
      this.mViewModelStore.a(paramString, paramClass);
    }
  }

  public static class AndroidViewModelFactory extends ViewModelProvider.NewInstanceFactory
  {
    private static AndroidViewModelFactory cR;
    private Application cc;

    public AndroidViewModelFactory(Application paramApplication)
    {
      this.cc = paramApplication;
    }

    public static AndroidViewModelFactory getInstance(Application paramApplication)
    {
      if (cR == null)
        cR = new AndroidViewModelFactory(paramApplication);
      return cR;
    }

    public <T extends ViewModel> T create(Class<T> paramClass)
    {
      if (AndroidViewModel.class.isAssignableFrom(paramClass));
      while (true)
      {
        try
        {
          ViewModel localViewModel = (ViewModel)paramClass.getConstructor(new Class[] { Application.class }).newInstance(new Object[] { this.cc });
          paramClass = localViewModel;
          return paramClass;
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(paramClass)), localNoSuchMethodException);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(paramClass)), localIllegalAccessException);
        }
        catch (InstantiationException localInstantiationException)
        {
          throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(paramClass)), localInstantiationException);
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(paramClass)), localInvocationTargetException);
        }
        paramClass = super.create(paramClass);
      }
    }
  }

  public static abstract interface Factory
  {
    public abstract <T extends ViewModel> T create(Class<T> paramClass);
  }

  public static class NewInstanceFactory
    implements ViewModelProvider.Factory
  {
    public <T extends ViewModel> T create(Class<T> paramClass)
    {
      try
      {
        ViewModel localViewModel = (ViewModel)paramClass.newInstance();
        return localViewModel;
      }
      catch (InstantiationException localInstantiationException)
      {
        throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(paramClass)), localInstantiationException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(paramClass)), localIllegalAccessException);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.ViewModelProvider
 * JD-Core Version:    0.6.2
 */