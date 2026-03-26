# 📡 Notify

A real-time notification system built with **Spring Boot** and **WebSockets (STOMP over SockJS)**. Users can connect, broadcast messages, and receive live notifications instantly through a sleek dark-themed web interface.

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5-6DB33F?logo=springboot&logoColor=white)
![WebSocket](https://img.shields.io/badge/WebSocket-STOMP-7c6aff)
![License](https://img.shields.io/badge/License-MIT-blue)

---

## ✨ Features

- **Real-time messaging** — Instant broadcast notifications via WebSocket
- **STOMP protocol** — Structured messaging over SockJS with automatic fallback
- **Live connection status** — Visual indicator showing connected/disconnected state
- **Responsive UI** — Modern dark-themed interface that works across devices
- **Zero database** — Lightweight, in-memory notifications with no persistence layer needed

---

## 🏗️ Tech Stack

| Layer      | Technology                          |
|------------|-------------------------------------|
| Backend    | Spring Boot 3.5, Spring WebSocket   |
| Protocol   | STOMP over SockJS                   |
| Frontend   | Vanilla HTML/CSS/JS                 |
| Build      | Maven                               |
| Java       | JDK 21                              |
| Libraries  | Lombok                              |

---

## 📁 Project Structure

```
Notify/
├── src/main/java/com/backend/Notify/
│   ├── NotifyApplication.java              # Application entry point
│   ├── config/
│   │   └── WebSocketConfig.java            # WebSocket & STOMP configuration
│   ├── controller/
│   │   └── NotificationController.java     # Message handling controller
│   └── model/
│       └── NotificationMessage.java        # Notification data model
├── src/main/resources/
│   ├── static/
│   │   └── index.html                      # Frontend UI
│   └── application.properties              # App configuration
└── pom.xml                                 # Maven build file
```

---

## 🚀 Getting Started

### Prerequisites

- **JDK 21** or higher
- **Maven 3.8+** (or use the included Maven wrapper)

### Run the Application

```bash
# Clone the repository
git clone https://github.com/your-username/Notify.git
cd Notify

# Run with Maven wrapper
./mvnw spring-boot:run
```

The app starts on **http://localhost:8080**.

### Usage

1. Open `http://localhost:8080` in your browser
2. Click **Connect** to establish a WebSocket connection
3. Enter your name and type a message
4. Click **Send** — the message broadcasts to all connected clients in real time

> 💡 Open multiple browser tabs to see live notifications across sessions.

---

## 🔌 WebSocket Endpoints

| Endpoint                | Type        | Description                                |
|-------------------------|-------------|--------------------------------------------|
| `/ws`                   | STOMP       | WebSocket connection endpoint (SockJS)     |
| `/app/notify`           | Send        | Send a notification message                |
| `/topic/notifications`  | Subscribe   | Subscribe to receive broadcast messages    |

### Message Format

**Send** (`/app/notify`):
```json
{
  "sender": "John",
  "message": "Hello everyone!"
}
```

**Receive** (`/topic/notifications`):
```json
{
  "sender": "John",
  "message": "Hello everyone!",
  "timestamp": "2026-03-26T10:30:00"
}
```

---

## 🛠️ Build

```bash
# Build the project
./mvnw clean package

# Run the JAR
java -jar target/Notify-0.0.1-SNAPSHOT.jar
```

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
