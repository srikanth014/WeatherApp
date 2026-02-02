# 🌤️ Weather App - Modern Android Weather Application

A premium weather application built with **Jetpack Compose** and **Material Design 3**. Features real-time weather data, smooth animations, and a beautiful user interface.

## ✨ Features

- 🌡️ Real-time weather data (temperature, humidity, wind, UV index, pressure)
- 🎨 Modern Material Design 3 UI with smooth animations
- 📍 City search functionality
- 🎬 Animated state transitions (loading, error, success, empty)
- ♿ WCAG AA accessible design
- 📱 Responsive on all screen sizes
- ⚡ 60fps animations with optimized builds

## 🛠️ Tech Stack

- **Jetpack Compose** - UI framework
- **MVVM** - Architecture pattern
- **LiveData** - State management
- **Retrofit + Gson** - API & JSON
- **Coil** - Image loading
- **Coroutines** - Async operations

## 📋 Requirements

- Android SDK: API 24+ (Target: 36)
- Kotlin 2.0.21
- Java 11+

## 🚀 Getting Started

### Clone & Setup
```bash
git clone https://github.com/yourusername/weather-app.git
cd weather-app
```

### Build
```bash
./gradlew build
```

### Run
```bash
./gradlew installDebug
```

## 🔌 API Configuration

1. Sign up at [WeatherAPI.com](https://www.weatherapi.com/)
2. Get your free API key
3. Open `Constants.kt` and add:
```kotlin
const val API_KEY = "YOUR_API_KEY_HERE"
```

## 📁 Project Structure

```
app/src/main/java/com/example/weatherapp/
├── WeatherScreen.kt          # Main UI composables
├── MainActivity.kt           # Activity entry
├── WeatherViewModel.kt       # State management
├── AnimationUtils.kt         # Animation constants
├── DesignSystem.kt          # Design tokens
└── api/
    ├── WeatherApi.kt        # API interface
    ├── WeatherModel.kt      # Data classes
    ├── Current.kt
    ├── Location.kt
    ├── Condition.kt
    └── NetworkResponse.kt
```

## 🎨 Design

- **Colors**: Indigo (#6366F1) → Purple (#8B5CF6) gradient
- **Typography**: 5-size hierarchy (11sp to 88sp)
- **Spacing**: 4dp to 48dp system
- **Elevation**: 2dp to 10dp system
- **Corners**: 8dp to 24dp rounded

## 📊 UI Components

- **SearchCard** - City search with gradient button
- **TemperatureCard** - Large gradient temperature display
- **LocationCard** - Location info with gradient
- **WeatherConditionsGrid** - 2×2 weather metrics
- **AdditionalDetailsGrid** - Date, time, feels-like, pressure
- **ErrorCard** - Error states with animations
- **LoadingCard** - Loading spinner with message
- **EmptyStateCard** - Friendly initial state

## 🔧 Build Optimization

- Parallel compilation enabled
- Build cache enabled
- ~30-50% faster builds
- 60fps animation target

## 📱 Responsive Design

- **Compact** (<600dp): Phones
- **Medium** (600-840dp): Foldables
- **Expanded** (840dp+): Tablets

## 🧪 Test

```bash
./gradlew test
./gradlew connectedAndroidTest
```

## 📦 Key Dependencies

- androidx.compose:bom:2024.09.00
- androidx.lifecycle:lifecycle-livedata-ktx:2.6.1
- com.squareup.retrofit2:retrofit:2.9.0
- com.google.code.gson:gson:2.10.1
- io.coil-kt:coil-compose:2.5.0

## 🔐 Permissions

- `INTERNET` - API calls

## 🚀 Future Enhancements

- 5-day forecast with swipeable cards
- Weather alerts and notifications
- Favorite cities bookmark
- Dark mode enhancement
- Map integration
- AI weather assistant

## 📄 License

MIT License - see LICENSE file

## 📞 Support

- Issues: GitHub Issues
- Email: your.email@example.com

---

**Status**: ✅ Production Ready  
**Version**: 2.0 Premium Edition  
**Last Updated**: February 3, 2026

